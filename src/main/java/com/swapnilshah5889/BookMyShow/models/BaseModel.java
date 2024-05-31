package com.swapnilshah5889.BookMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass // Schema Design
@Getter
@Setter
//@Entity -> Not required here because we don't want tot create the table for BaseModel.
public abstract class BaseModel {
    @Id // -> @Id denotes that this attribute is a PK of the table.
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //@Column(name = "identity")
    private Long id;
}
