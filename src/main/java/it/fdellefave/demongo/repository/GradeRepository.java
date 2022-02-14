package it.fdellefave.demongo.repository;

import it.fdellefave.demongo.model.document.GradesDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends MongoRepository<GradesDocument,String> {
}
