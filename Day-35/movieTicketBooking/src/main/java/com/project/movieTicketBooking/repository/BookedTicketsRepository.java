package com.project.movieTicketBooking.repository;

import com.project.movieTicketBooking.entity.BookedTickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookedTicketsRepository extends JpaRepository<BookedTickets, Long> {
    @Query("Select ticket from BookedTickets ticket where ticket.movieShowId=:showId and ticket.seatId=:seatId")
    BookedTickets findBookedTicketsByShowIdAndSeatId(Long showId, Long seatId);
}
