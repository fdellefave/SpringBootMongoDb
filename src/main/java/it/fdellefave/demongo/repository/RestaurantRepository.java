package it.fdellefave.demongo.repository;

import it.fdellefave.demongo.model.document.RestaurantDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends MongoRepository<RestaurantDocument,String> {
}
