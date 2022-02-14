package it.fdellefave.demongo.service;

import it.fdellefave.demongo.model.document.RestaurantDocument;

import java.util.List;

public interface RestaurantService {

    List<RestaurantDocument> restaurantPagination(int nPages, int limit);

    List<RestaurantDocument> getAll();

    String createResturant(RestaurantDocument document);
}
