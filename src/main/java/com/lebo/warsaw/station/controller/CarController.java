package com.lebo.warsaw.station.controller;

import com.lebo.warsaw.station.bo.CarBo;
import com.lebo.warsaw.station.model.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarBo carBo;

    @GetMapping("/car")
    public Car getCarId(@RequestParam("id") int id) {
        return carBo.getCarById(id);
    }
}
