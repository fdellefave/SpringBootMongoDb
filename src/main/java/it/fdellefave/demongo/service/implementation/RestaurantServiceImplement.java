package it.fdellefave.demongo.service.implementation;

import it.fdellefave.demongo.model.document.RestaurantDocument;
import it.fdellefave.demongo.repository.RestaurantRepository;
import it.fdellefave.demongo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImplement implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepo;


    @Override
    public List<RestaurantDocument> restaurantPagination(int nPages, int limit){
        Pageable pageable = PageRequest.of(nPages,limit);
        return restaurantRepo.findAll(pageable).getContent();
    }

    @Override
    public List<RestaurantDocument> getAll() {
        return restaurantRepo.findAll();
    }

    @Override
    public String createResturant(RestaurantDocument document) {
        return null;
    }
}
