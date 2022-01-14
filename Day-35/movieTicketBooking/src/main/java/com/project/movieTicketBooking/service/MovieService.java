package com.project.movieTicketBooking.service;

import com.project.movieTicketBooking.entity.Movie;
import com.project.movieTicketBooking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    /**
     * Method to get List<Movie> by movieDate
     *
     * @param date
     * @return List<Movie>
     */
    public List<Movie> getMoviesByDate(String date) {
        return movieRepository.findMoviesByDate(date);
    }

    /**
     * Method to get Movie by id
     *
     * @param movieId
     * @return Movie
     */
    public Movie getMoviesById(Long movieId) {
        return movieRepository.findByMovieId(movieId);
    }
}
