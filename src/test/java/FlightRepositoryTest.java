package com.airline.repository;

import com.airline.entity.Flight;
import com.airline.entity.enums.FlightStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.time.LocalDateTime;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class FlightRepositoryTest {

    @Autowired
    private FlightRepository flightRepository;

    @Test
    public void testSaveAndFindAllFlights() {
        Flight flight = new Flight();
        flight.setFlightNumber("AI999");
        flight.setOrigin("BLR");
        flight.setDestination("LON");
        flight.setDepartureTime(LocalDateTime.now());
        flight.setArrivalTime(LocalDateTime.now().plusHours(8));
        flight.setStatus(FlightStatus.ON_TIME);

        flightRepository.save(flight);

        List<Flight> flights = flightRepository.findAll();
        assertFalse(flights.isEmpty());
        assertEquals("AI999", flights.get(0).getFlightNumber());
    }
}
