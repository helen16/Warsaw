package com.lebo.warsaw.station.dao;

import com.lebo.warsaw.station.model.entity.Place;
import com.lebo.warsaw.station.model.entity.PlaceCategory;

import java.util.List;

public interface PlaceDao {
    List<PlaceCategory> getCategories();

    List<Place> getByCategoryId(List<Integer> id);

    List<Place> getAll();

    Place getById(Integer id);
}
