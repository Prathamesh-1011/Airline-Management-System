package com.airline.service;

import com.airline.dto.FlightDTO;

import java.util.List;

public interface FlightService {
    List<FlightDTO> getAllFlights(String sort);
    FlightDTO getFlightById(Long id);
    List<String> getFlightSchedule(Long id, List<String> dates);
}
