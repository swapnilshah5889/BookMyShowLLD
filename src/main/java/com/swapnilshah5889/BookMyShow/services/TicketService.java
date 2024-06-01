package com.swapnilshah5889.BookMyShow.services;

import com.swapnilshah5889.BookMyShow.exceptions.ShowSeatNotAvailableException;
import com.swapnilshah5889.BookMyShow.models.ShowSeat;
import com.swapnilshah5889.BookMyShow.models.Ticket;
import com.swapnilshah5889.BookMyShow.models.User;
import com.swapnilshah5889.BookMyShow.models.constants.ShowSeatState;
import com.swapnilshah5889.BookMyShow.models.constants.TicketStatus;
import com.swapnilshah5889.BookMyShow.repositories.ShowSeatRepository;
import com.swapnilshah5889.BookMyShow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    UserRepository userRepository;
    ShowSeatRepository showSeatRepository;

    @Autowired
    TicketService(UserRepository userRepository, ShowSeatRepository showSeatRepository) {
        this.showSeatRepository = showSeatRepository;
        this.userRepository = userRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE) // Locks this method
    public Ticket bookTicket(List<Long> showSeatIds, Long userId) throws ShowSeatNotAvailableException {

        // Fetch all show seat ids from the database
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);

        // Check if all the seats are available or not
        for(ShowSeat showSeat : showSeats) {
            if(!showSeat.getState().equals(ShowSeatState.AVAILABLE)) {
                throw new ShowSeatNotAvailableException(showSeat.getId());
            }
        }

        // Update the status of the seats to locked
        for(ShowSeat showSeat : showSeats) {
            showSeat.setState(ShowSeatState.LOCKED);
            showSeatRepository.save(showSeat);
        }

        Ticket ticket = new Ticket();
        // Find the user
        Optional<User> optionalUser = userRepository.findById(userId);

        // Throw an exception
        if(optionalUser.isEmpty()) {
            // throw am exception
        }

        ticket.setBookedBy(optionalUser.get());
        // Make ticket status pending until payment succeeds
        ticket.setTicketStatus(TicketStatus.PENDING);
        ticket.setShowSeats(showSeats);

        /*
        * Ticket has been generated and now navigate to the payment page
        * Once payment is successful, set the status to SUCCESS
        * */
        return null;
    }

}
