package com.airline.service.impl;

import com.airline.dto.FlightDTO;
import com.airline.entity.Flight;
import com.airline.repository.FlightRepository;
import com.airline.service.FlightService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<FlightDTO> getAllFlights(String sort) {
        // Implementation here
        return List.of();
    }

    @Override
    public FlightDTO getFlightById(Long id) {
        // Implementation here
        return null;
    }

    @Override
    public List<String> getFlightSchedule(Long id, List<String> dates) {
        // Implementation here
        return List.of();
    }
}
