package com.pluralsight.psfundamentals.repositories;

import com.pluralsight.psfundamentals.models.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
