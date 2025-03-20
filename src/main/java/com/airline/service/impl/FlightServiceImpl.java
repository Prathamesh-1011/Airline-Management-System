package com.airline.service.impl;

import com.airline.dto.FlightDTO;
import com.airline.entity.Flight;
import com.airline.repository.FlightRepository;
import com.airline.service.FlightService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<FlightDTO> getAllFlights(String sort) {
        List<Flight> flights = flightRepository.findAll();

        if ("desc".equalsIgnoreCase(sort)) {
            flights.sort((f1, f2) -> f2.getDepartureTime().compareTo(f1.getDepartureTime()));
        } else {
            flights.sort((f1, f2) -> f1.getDepartureTime().compareTo(f2.getDepartureTime()));
        }

        return flights.stream()
                .map(flight -> new FlightDTO(
                        flight.getId(),
                        flight.getFlightNumber(),
                        flight.getOrigin(),
                        flight.getDestination(),
                        flight.getDepartureTime().toString(),
                        flight.getArrivalTime().toString(),
                        flight.getStatus().name()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public FlightDTO getFlightById(Long id) {
        Flight flight = flightRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Flight not found"));
        return new FlightDTO(
                flight.getId(),
                flight.getFlightNumber(),
                flight.getOrigin(),
                flight.getDestination(),
                flight.getDepartureTime().toString(),
                flight.getArrivalTime().toString(),
                flight.getStatus().name()
        );
    }

    @Override
    public List<String> getFlightSchedule(Long id, List<String> dates) {
        Flight flight = flightRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Flight not found"));

        return dates.stream()
                .map(date -> "Flight " + flight.getFlightNumber() + " scheduled for " + date)
                .collect(Collectors.toList());
    }
}
