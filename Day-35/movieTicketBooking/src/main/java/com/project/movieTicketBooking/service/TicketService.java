package com.project.movieTicketBooking.service;

import com.project.movieTicketBooking.entity.Ticket;
import com.project.movieTicketBooking.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

}
