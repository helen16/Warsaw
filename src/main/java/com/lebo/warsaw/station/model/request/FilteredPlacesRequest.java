package com.lebo.warsaw.station.model.request;

import java.util.List;

public class FilteredPlacesRequest {
    private List<Integer> categoryIds;

    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }
}
