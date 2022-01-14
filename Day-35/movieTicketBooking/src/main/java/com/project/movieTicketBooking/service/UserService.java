package com.project.movieTicketBooking.service;

import com.project.movieTicketBooking.entity.User;
import com.project.movieTicketBooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }
    public User getUserByEmailAndPassword(String email, String password){
        return userRepository.findUserByEmailAndPassword(email, password);
    }
    public User getUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }

    public User getUserById(Long userId) {
        return userRepository.findUserByUserId(userId);
    }
}
