package com.airline.service.impl;

import com.airline.dto.TicketDTO;
import com.airline.entity.Flight;
import com.airline.entity.Ticket;
import com.airline.entity.enums.TicketStatus;
import com.airline.repository.FlightRepository;
import com.airline.repository.TicketRepository;
import com.airline.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final FlightRepository flightRepository;

    public TicketServiceImpl(TicketRepository ticketRepository, FlightRepository flightRepository) {
        this.ticketRepository = ticketRepository;
        this.flightRepository = flightRepository;
    }

    @Override
    public TicketDTO createTicket(TicketDTO ticketDTO) {
        Flight flight = flightRepository.findById(ticketDTO.getFlightId())
                .orElseThrow(() -> new RuntimeException("Flight not found"));

        Ticket ticket = new Ticket();
        ticket.setPassengerName(ticketDTO.getPassengerName());
        ticket.setEmail(ticketDTO.getEmail());
        ticket.setFlight(flight);
        ticket.setSeatNumber(ticketDTO.getSeatNumber());
        ticket.setStatus(TicketStatus.ACTIVE);

        Ticket savedTicket = ticketRepository.save(ticket);

        return new TicketDTO(
                savedTicket.getId(),
                savedTicket.getPassengerName(),
                savedTicket.getEmail(),
                savedTicket.getFlight().getId(),
                savedTicket.getSeatNumber(),
                savedTicket.getStatus().name()
        );
    }

    @Override
    public TicketDTO getTicketById(Long id) {
        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));

        return new TicketDTO(
                ticket.getId(),
                ticket.getPassengerName(),
                ticket.getEmail(),
                ticket.getFlight().getId(),
                ticket.getSeatNumber(),
                ticket.getStatus().name()
        );
    }

    @Override
    public void cancelTicket(Long id) {
        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));

        ticket.setStatus(TicketStatus.CANCELLED);
        ticketRepository.save(ticket);
    }
}
