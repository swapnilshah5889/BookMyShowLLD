package com.swapnilshah5889.BookMyShow.exceptions;

public class ShowSeatNotAvailableException extends Exception {

    public ShowSeatNotAvailableException(Long showSeatId) {
        super("Show seat with "+showSeatId+" ID is not available");
    }
}
