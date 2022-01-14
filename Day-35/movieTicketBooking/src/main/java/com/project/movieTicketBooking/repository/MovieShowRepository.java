package com.project.movieTicketBooking.repository;

import com.project.movieTicketBooking.entity.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieShowRepository extends JpaRepository<MovieShow, Long> {
    /**
     * Method to find movieShow with movieId and name that matches with parameters movieId and name
     *
     * @return MovieShow
     */
    @Query("Select movieShow from MovieShow movieShow where movieShow.movieId=:movieId and movieShow.name=:name")
    MovieShow findShowByNameAndMovieId(Long movieId, String name);

    /**
     * Method to find movieShow with id that matches with parameters id
     *
     * @param id
     * @return
     */
    @Query("Select movieShow from MovieShow movieShow where movieShow.id=:id")
    MovieShow findByMovieShowId(Long id);
}
