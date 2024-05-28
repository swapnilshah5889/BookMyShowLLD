package com.swapnilshah5889.BookMyShow.models;


import com.swapnilshah5889.BookMyShow.Theatre;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel {
    private String name;

    @OneToMany
    private List<Theatre> theatres;
}