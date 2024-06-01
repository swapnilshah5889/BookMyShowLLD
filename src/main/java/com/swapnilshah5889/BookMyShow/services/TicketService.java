package com.swapnilshah5889.BookMyShow.services;

import com.swapnilshah5889.BookMyShow.models.Ticket;
import com.swapnilshah5889.BookMyShow.models.User;
import com.swapnilshah5889.BookMyShow.repositories.ShowSeatRepository;
import com.swapnilshah5889.BookMyShow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    UserRepository userRepository;
    ShowSeatRepository showSeatRepository;

    @Autowired
    TicketService(UserRepository userRepository, ShowSeatRepository showSeatRepository) {
        this.showSeatRepository = showSeatRepository;
        this.userRepository = userRepository;
    }

    public Ticket bookTicket(List<Long> showSeatIds, Long userId) {
        // TODO
        return null;
    }

}
