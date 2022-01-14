package com.project.movieTicketBooking.service;

import com.project.movieTicketBooking.entity.BookedTickets;
import com.project.movieTicketBooking.repository.BookedTicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookedTicketsService {
    @Autowired
    private BookedTicketsRepository bookedTicketsRepository;

    public void saveTicket(BookedTickets bookedTickets1) {
        bookedTicketsRepository.save(bookedTickets1);
    }

    public BookedTickets getBookedTicketByShowIdAndSeatId(Long showId, Long seatId) {
        return bookedTicketsRepository.findBookedTicketsByShowIdAndSeatId(showId, seatId);
    }
}
