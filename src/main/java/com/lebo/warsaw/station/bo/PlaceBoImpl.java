package com.lebo.warsaw.station.bo;

import com.lebo.warsaw.station.dao.PlaceDao;
import com.lebo.warsaw.station.model.entity.Place;
import com.lebo.warsaw.station.model.entity.PlaceCategory;
import com.lebo.warsaw.station.model.request.FilteredPlacesRequest;
import com.lebo.warsaw.station.model.response.PlaceDetailsResponse;
import com.lebo.warsaw.station.model.response.PlaceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PlaceBoImpl implements PlaceBo {

    @Autowired
    public PlaceDao placeDao;

    @Override
    public List<PlaceCategory> getCategories() {
        return placeDao.getCategories();
    }

    @Override
    public List<PlaceResponse> getPlacesByCategoryId(FilteredPlacesRequest request) {
        List<Integer> categoryIds = request.getCategoryIds();
        List<Place> list;
        if (categoryIds.isEmpty()) {
            list = placeDao.getAll();
        } else {
            list = placeDao.getByCategoryId(categoryIds);
        }
        List<PlaceResponse> result = new ArrayList<>();
        for (Place place : list) {
            PlaceResponse toResponse = place.toResponse();
            result.add(toResponse);
        }
        return result;
    }

    @Override
    public PlaceDetailsResponse getPlaceById(int id) {
        PlaceDetailsResponse result;
        try {
            result = placeDao.getById(id).toDetailsResponse();
        } catch (NoResultException exc) {
            result = null;
        }
        return result;
    }
}
