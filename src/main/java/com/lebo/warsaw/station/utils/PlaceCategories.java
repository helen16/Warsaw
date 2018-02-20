package com.lebo.warsaw.station.utils;

import com.lebo.warsaw.station.bo.PlaceBo;
import com.lebo.warsaw.station.model.entity.PlaceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PlaceCategories {
    private final Map<Integer, String> categories = new HashMap<>();

    @Autowired
    public void initCategories(PlaceBo placeBo) {
        List<PlaceCategory> categoryList = placeBo.getCategories();
        for (PlaceCategory category : categoryList) {
            categories.put(category.getId(), category.getName());
        }
    }

    public String getNameById(int id) {
        return categories.get(id);
    }

    public Map<Integer, String> getCategories() {
        return categories;
    }
}
