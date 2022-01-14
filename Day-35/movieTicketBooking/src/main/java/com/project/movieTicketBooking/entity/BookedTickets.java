package com.project.movieTicketBooking.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
public class BookedTickets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "movieshowid")
    private Long movieShowId;
    @Column(name = "seatId")
    private Long seatId;
    @Column(name = "userId")
    private Long userId;

    public BookedTickets() {

    }

    public BookedTickets(Long movieShowId, Long seatId, Long userId) {
        this.movieShowId = movieShowId;
        this.seatId = seatId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public Long getMovieShowId() {
        return movieShowId;
    }

    public void setMovieShowId(Long movieShowId) {
        this.movieShowId = movieShowId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
