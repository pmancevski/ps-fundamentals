package com.pluralsight.psfundamentals.services;

import com.pluralsight.psfundamentals.models.Ticket;

public interface TicketService {
    Iterable<Ticket> listTickets();
}


