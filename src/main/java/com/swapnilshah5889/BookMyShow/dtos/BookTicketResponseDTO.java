package com.swapnilshah5889.BookMyShow.dtos;

import com.swapnilshah5889.BookMyShow.models.Ticket;
import com.swapnilshah5889.BookMyShow.models.constants.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDTO {

    private Ticket ticket;
    private ResponseStatus status;

}
