package it.fdellefave.demongo.controller;

import it.fdellefave.demongo.model.document.RestaurantDocument;
import it.fdellefave.demongo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @PostMapping
    public String createRestaurant(@RequestBody RestaurantDocument document){
        return service.createResturant(document);
    }

    @GetMapping("/pagination")
    public List<RestaurantDocument> restaurantPagination(@RequestParam int nPages,@RequestParam int limit){
        return service.restaurantPagination(nPages,limit);
    }

    @GetMapping("/getAll")
    public List<RestaurantDocument> getAll(){
        return service.getAll();
    }
}
