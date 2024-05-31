package com.swapnilshah5889.BookMyShow.models;

import com.swapnilshah5889.BookMyShow.models.constants.Feature;
import com.swapnilshah5889.BookMyShow.models.constants.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;

    @ManyToMany
    private List<Actor> actors;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> movieFeatures;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Genre> genre;

}