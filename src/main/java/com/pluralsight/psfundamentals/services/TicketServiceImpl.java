package com.pluralsight.psfundamentals.services;

import com.pluralsight.psfundamentals.models.Ticket;
import com.pluralsight.psfundamentals.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }

}
