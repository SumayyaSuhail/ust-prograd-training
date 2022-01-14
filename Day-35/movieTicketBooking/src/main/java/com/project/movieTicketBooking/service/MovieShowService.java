package com.project.movieTicketBooking.service;

import com.project.movieTicketBooking.entity.MovieShow;
import com.project.movieTicketBooking.repository.MovieShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieShowService {
    @Autowired
    private MovieShowRepository movieShowRepository;

    /**
     * Method to get Show by name and movieId
     *
     * @param movieId
     * @param name
     * @return MovieShow
     */
    public MovieShow getShowByNameAndMovieId(Long movieId, String name) {
        return movieShowRepository.findShowByNameAndMovieId(movieId, name);
    }

    /**
     * Method to get Show by id
     *
     * @param movieShowId
     * @return MovieShow
     */
    public MovieShow getShowById(Long movieShowId) {
        return movieShowRepository.findByMovieShowId(movieShowId);
    }
}
