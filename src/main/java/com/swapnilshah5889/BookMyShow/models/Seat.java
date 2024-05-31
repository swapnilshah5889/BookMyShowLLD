package com.swapnilshah5889.BookMyShow.models;

import com.swapnilshah5889.BookMyShow.models.constants.SeatStatus;
import com.swapnilshah5889.BookMyShow.models.constants.SeatType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String name;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    @Column(name = "`row`", nullable = false)
    private int row;

    @Column(name = "col")
    private int column;

    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;

}