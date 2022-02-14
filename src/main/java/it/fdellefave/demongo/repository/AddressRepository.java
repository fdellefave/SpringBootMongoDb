package it.fdellefave.demongo.repository;

import it.fdellefave.demongo.model.document.AddressDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<AddressDocument,String> {
}
