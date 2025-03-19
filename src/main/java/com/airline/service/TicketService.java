package com.airline.service;

import com.airline.dto.TicketDTO;

public interface TicketService {
    TicketDTO createTicket(TicketDTO ticketDTO);
    TicketDTO getTicketById(Long id);
    void cancelTicket(Long id);
}
