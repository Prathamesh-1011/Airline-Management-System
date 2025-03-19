package com.airline.controller;

import com.airline.dto.FlightDTO;
import com.airline.entity.Flight;
import com.airline.service.FlightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public ResponseEntity<List<FlightDTO>> getAllFlights(@RequestParam(defaultValue = "asc") String sort) {
        return ResponseEntity.ok(flightService.getAllFlights(sort));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlightDTO> getFlightById(@PathVariable Long id) {
        return ResponseEntity.ok(flightService.getFlightById(id));
    }

    @GetMapping("/{id}/schedules")
    public ResponseEntity<List<String>> getFlightSchedule(
            @PathVariable Long id,
            @RequestParam List<String> dates
    ) {
        return ResponseEntity.ok(flightService.getFlightSchedule(id, dates));
    }
}
