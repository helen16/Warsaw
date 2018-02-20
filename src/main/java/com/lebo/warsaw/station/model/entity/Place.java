package com.lebo.warsaw.station.model.entity;

import com.lebo.warsaw.station.model.response.PlaceDetailsResponse;
import com.lebo.warsaw.station.model.response.PlaceResponse;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "place")
public class Place implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @Column(name = "category_id")
    private Integer categoryId;

    @NotBlank
    private Double latitude;

    @NotBlank
    private Double longitude;

    private String photoPath;

    public PlaceResponse toResponse() {
        PlaceResponse response = new PlaceResponse();
        response.setId(id);
        response.setTitle(title);
        response.setCategoryId(categoryId);
        response.setLatitude(latitude);
        response.setLongitude(longitude);
        return response;
    }

    public PlaceDetailsResponse toDetailsResponse() {
        PlaceDetailsResponse response = new PlaceDetailsResponse();
        response.setId(id);
        response.setTitle(title);
        response.setDescription(description);
        response.setPhotoPath(photoPath);
        return response;
    }
}
