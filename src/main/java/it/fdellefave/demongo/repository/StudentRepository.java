package it.fdellefave.demongo.repository;

import it.fdellefave.demongo.model.document.StudentDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<StudentDocument,String> {

    List<StudentDocument> findByNameAndEmail(String name, String email);
}
