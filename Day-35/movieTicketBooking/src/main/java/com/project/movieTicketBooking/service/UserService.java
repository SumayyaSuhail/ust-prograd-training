package com.project.movieTicketBooking.service;

import com.project.movieTicketBooking.entity.User;
import com.project.movieTicketBooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    /**
     * Method to save User
     *
     * @param user
     */
    public void saveUser(User user) {
        userRepository.save(user);
    }

    /**
     * Method to get User by email and password
     *
     * @param email
     * @param password
     * @return User
     */
    public User getUserByEmailAndPassword(String email, String password) {
        return userRepository.findUserByEmailAndPassword(email, password);
    }

    /**
     * Method to get User by email
     *
     * @param email
     * @return User
     */
    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    /**
     * Method to get User by Id
     *
     * @param userId
     * @return User
     */
    public User getUserById(Long userId) {
        return userRepository.findUserByUserId(userId);
    }
}
