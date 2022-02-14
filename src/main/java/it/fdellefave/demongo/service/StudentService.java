package it.fdellefave.demongo.service;

import it.fdellefave.demongo.model.document.StudentDocument;

import java.util.List;

public interface StudentService {

    Iterable<StudentDocument> getAll();

    String create(StudentDocument document);

    StudentDocument findById(String id);

    String remove(String id);

    String update(StudentDocument document, String id);

    String updateRight(StudentDocument document);

    List<StudentDocument> findByNameAndEmail_service(String name, String email);
}
