package com.swapnilshah5889.BookMyShow.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketRequestDTO {

    private List<Long> showSeatIds;
    private Long userId;

}
