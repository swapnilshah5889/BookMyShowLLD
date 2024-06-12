package com.swapnilshah5889.BookMyShow.controllers;

import com.swapnilshah5889.BookMyShow.dtos.BookTicketRequestDTO;
import com.swapnilshah5889.BookMyShow.dtos.BookTicketResponseDTO;
import com.swapnilshah5889.BookMyShow.dtos.CancelRequestDTO;
import com.swapnilshah5889.BookMyShow.dtos.CancelResponseDTO;
import com.swapnilshah5889.BookMyShow.models.Ticket;
import com.swapnilshah5889.BookMyShow.models.constants.ResponseStatus;
import com.swapnilshah5889.BookMyShow.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class TicketController {

    TicketService ticketService;

    @Autowired
    TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public BookTicketResponseDTO bookTicket(BookTicketRequestDTO request) {

        BookTicketResponseDTO response = new BookTicketResponseDTO();
        try{

            Ticket ticket = ticketService.bookTicket(
                    request.getShowSeatIds(),
                    request.getUserId()
            );
            response.setTicket(ticket);
            response.setStatus(ResponseStatus.SUCCESS);

        }
        catch (Exception e) {
            response.setStatus(ResponseStatus.FAILURE);
        }

        return response;

    }

    public CancelResponseDTO cancelTicket(CancelRequestDTO request) {
        CancelResponseDTO response = new CancelResponseDTO();
        // TODO
        return response;
    }
}
