package com.project.movieTicketBooking.controller;

import com.project.movieTicketBooking.entity.*;
import com.project.movieTicketBooking.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class UserController {
    static Long userId;
    static Long movieId;
    static Long showId;
    @Autowired
    private UserService userService;

    @Autowired
    private HistoryService historyService;
    @Autowired
    private BookedTicketsService bookedTicketsService;

    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieShowService movieShowService;

    /**
     * Method to display index.html
     *
     * @return index.html
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * Method to display register.html
     *
     * @return register.html
     */
    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    /**
     * Method to display login.html
     *
     * @return login.html
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * Method to display login after registration
     *
     * @param request gets details from user
     * @param model   display message if passwords does not match
     * @return login.html
     */
    @PostMapping("/login")
    public String loginAfterRegister(HttpServletRequest request, Model model) {
        if (!(request.getParameter("password").equals(request.getParameter("confirmPassword")))) {
            model.addAttribute("message", "Re-enter the same password!!!");
            return "register";
        } else {
            model.addAttribute("successMessage", "Registered Successfully!!!");
            String email = request.getParameter("email");
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String phoneNumber = request.getParameter("phoneNumber");
            User user = new User(email, userName, password, phoneNumber);
            userService.saveUser(user);
            return "login";
        }
    }

    /**
     * Method to display home.html after selecting date
     *
     * @param model   displays the details of movies of the selected date
     * @param request gets the date from user
     * @return home.html
     */
    @RequestMapping("/home")
    public String home(Model model, HttpServletRequest request) {
        List<Movie> movies = movieService.getMoviesByDate(request.getParameter("date"));
        model.addAttribute("movies", movies);
        return "home";
    }

    /**
     * Method to display home after successful login
     *
     * @param model   displays message for valid/invalid login
     * @param request gets the email and password from the user
     * @return home.html
     */
    @PostMapping("/home")
    public String homeAfterLogin(Model model, HttpServletRequest request) {
        User user = userService.getUserByEmailAndPassword(request.getParameter("email"), request.getParameter("password"));
        if (!(Objects.isNull(user))) {
            model.addAttribute("successMessage", "Login Successful!!!");
            userId = user.getUserId();
            return "home";
        } else {
            model.addAttribute("message", "Invalid user credentials!!!");
            return "login";
        }
    }

    /**
     * Method to display forgotPassword.html
     *
     * @return forgotPassword.html
     */
    @RequestMapping("/forgotPassword")
    public String forgotPassword() {
        return "forgotPassword";
    }

    /**
     * Method to update Password
     *
     * @param request gets email and new password from user
     * @param model   displays message after successful update of password
     * @return index.html
     */
    @PostMapping("/")
    public String updatePassword(HttpServletRequest request, Model model) {
        if (!(request.getParameter("newPassword").equals(request.getParameter("confirmPassword")))) {
            model.addAttribute("message", "Re-enter the same password!!!");
            return "forgotPassword";
        } else {
            String email = request.getParameter("email");
            String password = request.getParameter("newPassword");
            User user = userService.getUserByEmail(email);
            user.setPassword(password);
            userService.saveUser(user);
            return "index";
        }
    }

    /**
     * Method to display movieDetails.html
     *
     * @return movieDetails.html
     */
    @RequestMapping("/movieDetails")
    public String movieDetails() {
        return "movieDetails";
    }

    /**
     * Method to display movieDetails after selecting movie
     *
     * @param request gets the id of selected movie
     * @param model   displays movie details of the selected movie
     * @return movieDetails.html
     */
    @PostMapping("/movieDetails")
    public String movieDetailsAfterHome(HttpServletRequest request, Model model) {
        movieId = Long.parseLong(request.getParameter("movieId"));
        Movie movie = movieService.getMoviesById(movieId);
        model.addAttribute("name", movie.getMovieName());
        model.addAttribute("genre", movie.getGenre());
        model.addAttribute("movieDate", movie.getMovieDate());
        model.addAttribute("price", movie.getPrice());
        return "movieDetails";
    }

    /**
     * Method to display ticket.html
     *
     * @return ticket.html
     */
    @RequestMapping("/ticket")
    public String ticket() {

        return "ticket";
    }

    /**
     * Method to display ticket after selecting show
     *
     * @param request gets the id of selected show
     * @return ticket.html
     */
    @PostMapping("/ticket")
    public String ticketAfterMovieDetails(HttpServletRequest request) {
        MovieShow movieShow = movieShowService.getShowByNameAndMovieId(movieId, request.getParameter("showMovie"));
        showId = movieShow.getId();
        return "ticket";
    }

    /**
     * Method to display payment.html
     *
     * @return payment.html
     */
    @RequestMapping("/payment")
    public String payment() {
        return "payment";
    }

    /**
     * Method to display payment after selecting tickets
     *
     * @param request gets the bookedSeats from the user
     * @param model
     * @return displays payment details after a successful booking
     */
    @PostMapping("/payment")
    public String paymentAfterTickets(HttpServletRequest request, Model model) {
        String bookedSeats = request.getParameter("bookedSeats");
        String[] seats = bookedSeats.split(",");
        for (String seat : seats) {
            Long seatId = Long.parseLong(seat);
            BookedTickets bookedTickets = bookedTicketsService.getBookedTicketByShowIdAndSeatId(showId, seatId);
            if (!(Objects.isNull(bookedTickets))) {
                model.addAttribute("message", "Seat is already booked, Please choose another seat");
                return "ticket";
            }
        }
        for (String seat : seats) {
            Long seatId = Long.parseLong(seat);
            BookedTickets bookedTickets = bookedTicketsService.getBookedTicketByShowIdAndSeatId(showId, seatId);
            BookedTickets bookedTickets1 = new BookedTickets(showId, seatId, userId);
            bookedTicketsService.saveTicket(bookedTickets1);
        }
        User user = userService.getUserById(userId);
        Movie movie = movieService.getMoviesById(movieId);
        MovieShow movieShow = movieShowService.getShowById(showId);
        model.addAttribute("name", user.getUserName());
        model.addAttribute("movieName", movie.getMovieName());
        model.addAttribute("theatreName", "PVR Cinemas");
        model.addAttribute("showName", movieShow.getName());
        model.addAttribute("movieDate", movie.getMovieDate());
        model.addAttribute("ticketCount", seats.length);
        model.addAttribute("seats", bookedSeats);
        Double amount = (seats.length) * (movie.getPrice());
        model.addAttribute("amount", amount);
        History history = new History(user.getUserName(), "PVR Cinemas", movieShow.getName(), movie.getMovieDate(), seats.length, bookedSeats, amount, movie.getMovieName());
        historyService.saveHistory(history);
        return "payment";
    }

    /**
     * Method to display history.html
     *
     * @param model displays history of bookings
     * @return history.html
     */
    @RequestMapping("/history")
    public String history(Model model) {
        User user = userService.getUserById(userId);
        List<History> histories = historyService.getHistoryByUserName(user.getUserName());
        model.addAttribute("histories", histories);
        return "history";
    }
}
