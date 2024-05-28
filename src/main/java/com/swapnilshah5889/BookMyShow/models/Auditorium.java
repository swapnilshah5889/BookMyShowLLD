package com.swapnilshah5889.BookMyShow.models;

import com.swapnilshah5889.BookMyShow.models.constants.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel {
    private String name; //Primitive Attributes.

    @OneToMany
    private List<Seat> seats;

    @ElementCollection //because we have list of feature enum.
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> auditoriumFeatures;
}