package com.airline.service.impl;

import com.airline.dto.TicketDTO;
import com.airline.entity.Flight;
import com.airline.entity.Ticket;
import com.airline.entity.enums.TicketStatus;
import com.airline.repository.FlightRepository;
import com.airline.repository.TicketRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicketServiceImplTest {

    private TicketRepository ticketRepository;
    private FlightRepository flightRepository;
    private TicketServiceImpl ticketService;

    @BeforeEach
    public void setup() {
        ticketRepository = mock(TicketRepository.class);
        flightRepository = mock(FlightRepository.class);
        ticketService = new TicketServiceImpl(ticketRepository, flightRepository);
    }

    @Test
    public void testCreateTicket() {
        Flight flight = new Flight();
        flight.setId(1L);

        when(flightRepository.findById(1L)).thenReturn(Optional.of(flight));

        Ticket savedTicket = new Ticket();
        savedTicket.setId(10L);
        savedTicket.setSeatNumber("B12");
        savedTicket.setPassengerName("John");
        savedTicket.setEmail("john@example.com");
        savedTicket.setStatus(TicketStatus.ACTIVE);
        savedTicket.setFlight(flight);

        when(ticketRepository.save(any())).thenReturn(savedTicket);

        TicketDTO dto = new TicketDTO(null, "John", "john@example.com", 1L, "B12", null);
        TicketDTO created = ticketService.createTicket(dto);

        assertNotNull(created);
        assertEquals("John", created.getPassengerName());
        assertEquals("ACTIVE", created.getStatus());
    }
}
