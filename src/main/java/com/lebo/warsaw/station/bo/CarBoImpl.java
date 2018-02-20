package com.lebo.warsaw.station.bo;

import com.lebo.warsaw.station.dao.CarDao;
import com.lebo.warsaw.station.model.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarBoImpl implements CarBo {

    @Autowired
    private CarDao carDao;

    @Override
    public Car getCarById(int id) {
        return carDao.getCarByIdFromDb(id);
    }
}
