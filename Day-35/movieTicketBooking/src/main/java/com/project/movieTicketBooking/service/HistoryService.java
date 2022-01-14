package com.project.movieTicketBooking.service;

import com.project.movieTicketBooking.entity.History;
import com.project.movieTicketBooking.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {
    @Autowired
    private HistoryRepository historyRepository;

    public void saveHistory(History history){
        historyRepository.save(history);
    }

    public List<History> getHistoryByUserName(String userName) {
        return historyRepository.findHistoryByUserId(userName);
    }
}
