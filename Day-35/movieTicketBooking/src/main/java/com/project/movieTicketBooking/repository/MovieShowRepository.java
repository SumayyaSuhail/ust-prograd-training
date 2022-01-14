package com.project.movieTicketBooking.repository;

import com.project.movieTicketBooking.entity.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieShowRepository extends JpaRepository<MovieShow, Long> {
        @Query("Select movieShow from MovieShow movieShow where movieShow.movieId=:movieId and movieShow.name=:name")
        MovieShow findShowByNameAndMovieId(Long movieId, String name);

        @Query("Select movieShow from MovieShow movieShow where movieShow.id=:id")
        MovieShow findByMovieShowId(Long id);
}
