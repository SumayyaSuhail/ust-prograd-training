package com.project.movieTicketBooking.repository;

import com.project.movieTicketBooking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    /**
     * Method to find list of movies with movieDate that matches with parameter movieDate
     *
     * @return List<Movie>
     */
    @Query("Select movie from Movie movie where movie.movieDate=:date")
    List<Movie> findMoviesByDate(@Param("date") String date);

    /**
     * Method to find movie by id
     *
     * @return Movie
     */
    Movie findByMovieId(Long movieId);
}
