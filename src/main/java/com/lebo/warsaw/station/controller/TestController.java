package com.lebo.warsaw.station.controller;

import com.lebo.warsaw.station.model.response.SimpleResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public SimpleResponse onTest() {
        return new SimpleResponse("Success");
    }
}
