package com.lebo.warsaw.station.controller;

import com.lebo.warsaw.station.bo.PlaceBo;
import com.lebo.warsaw.station.model.request.FilteredPlacesRequest;
import com.lebo.warsaw.station.model.response.PlaceDetailsResponse;
import com.lebo.warsaw.station.model.response.PlaceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceController {

    @Autowired
    private PlaceBo placeBo;

    @PostMapping("/filter")
    public List<PlaceResponse> getPlacesByCategoryId(@RequestBody FilteredPlacesRequest request) {
        return placeBo.getPlacesByCategoryId(request);
    }

    @GetMapping
    @ResponseBody
    public PlaceDetailsResponse getPlaceDetails(@RequestParam("id") int id) {
        return placeBo.getPlaceById(id);
    }
}
