package com.airline.service.impl;

import com.airline.dto.TicketDTO;
import com.airline.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public TicketDTO createTicket(TicketDTO ticketDTO) {
        // Implementation here
        return null;
    }

    @Override
    public TicketDTO getTicketById(Long id) {
        // Implementation here
        return null;
    }

    @Override
    public void cancelTicket(Long id) {
        // Implementation here
    }
}
