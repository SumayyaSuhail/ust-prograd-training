package com.project.movieTicketBooking.repository;

import com.project.movieTicketBooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Method to find the user with email and password that matches with parameters email and password
     *
     * @return user
     */
    @Query("Select user from User user where user.email=:email and user.password=:password")
    User findUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    /**
     * Method to find the user with email that matches with parameter email
     *
     * @return user
     */
    @Query("Select user from User user where user.email=:email")
    User findUserByEmail(@Param("email") String email);

    /**
     * Method to find the customer with userId
     *
     * @return user
     */
    User findUserByUserId(Long userId);
}
