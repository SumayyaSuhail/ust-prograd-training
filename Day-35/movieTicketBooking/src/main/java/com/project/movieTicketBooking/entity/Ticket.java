package com.project.movieTicketBooking.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
@Component
@Entity
public class Ticket {
    @Id
    private Long id;
    @Column(name = "seatid")
    private Long seatId;
    @Column(name = "movieshowid")
    private Long movieShowId;
    public Ticket(){

    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieShowId() {
        return movieShowId;
    }

    public void setMovieShowId(Long movieShowId) {
        this.movieShowId = movieShowId;
    }
}
