package com.project.movieTicketBooking.repository;

import com.project.movieTicketBooking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Query("Select movie from Movie movie where movie.movieDate=:date")
    List<Movie> findMoviesByDate(@Param("date") String date);

    Movie findByMovieId(Long movieId);
}
