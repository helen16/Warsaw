package com.lebo.warsaw.station.dao;

import com.lebo.warsaw.station.model.entity.Car;

public interface CarDao {
    Car getCarByIdFromDb(int id);
}
