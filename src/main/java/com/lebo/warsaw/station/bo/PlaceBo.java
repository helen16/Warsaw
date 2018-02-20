package com.lebo.warsaw.station.bo;

import com.lebo.warsaw.station.model.entity.PlaceCategory;
import com.lebo.warsaw.station.model.request.FilteredPlacesRequest;
import com.lebo.warsaw.station.model.response.PlaceDetailsResponse;
import com.lebo.warsaw.station.model.response.PlaceResponse;

import java.util.List;

public interface PlaceBo {
    List<PlaceCategory> getCategories();

    List<PlaceResponse> getPlacesByCategoryId(FilteredPlacesRequest request);

    PlaceDetailsResponse getPlaceById(int id);
}
