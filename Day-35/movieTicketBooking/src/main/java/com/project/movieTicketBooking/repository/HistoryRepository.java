package com.project.movieTicketBooking.repository;

import com.project.movieTicketBooking.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Long> {
    /**
     * Method to find list of history with username that matches with parameter userName
     *
     * @return List<History>
     */
    @Query("Select history from History history where history.userName=:userName")
    List<History> findHistoryByUserId(String userName);
}
