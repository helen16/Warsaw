package com.lebo.warsaw.station.model.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "place_category")
public class PlaceCategory implements Serializable {
    @Id
    private Integer id;

    @NotBlank
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
