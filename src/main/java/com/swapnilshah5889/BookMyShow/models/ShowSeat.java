package com.swapnilshah5889.BookMyShow.models;

import com.swapnilshah5889.BookMyShow.models.constants.ShowSeatState;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Table(name = "show_seat_mapping")
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatState state;
}
