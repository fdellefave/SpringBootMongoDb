package it.fdellefave.demongo.service.implementation;

import it.fdellefave.demongo.model.document.StudentDocument;
import it.fdellefave.demongo.repository.StudentRepository;
import it.fdellefave.demongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplement implements StudentService {

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public Iterable<StudentDocument> getAll() {
        return studentRepo.findAll();
    }

    @Override
    public String create(StudentDocument document) {
        studentRepo.save(document);
        return "Studente inserito correttamente";
    }

    @Override
    public StudentDocument findById(String id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public String remove(String id) {
        studentRepo.delete(findById(id));
        return "Studente rimosso";
    }


    /**
     * Metodo sbagliato per effettuare l'update, in questo modo, tutte le reference di quel documento vanno in conflitto.
     * Meglio eseguire il metodo save e passare direttamente nel documento l'id del documento da sostituire. In quel caso
     * il sistema utilizzerà il metodo save come update.
     * */
    @Override
    public String update(StudentDocument document, String id) {
        if (findById(id) == null) {
            throw new IllegalArgumentException("");
        }
        remove(id);
        studentRepo.save(document);
        return "Studente aggiornato";
    }

    /**
     * metodo corretto per aggiornare un document*/
    @Override
    public String updateRight(StudentDocument document) {
        studentRepo.save(document);
        return "Studente aggiornato";
    }

    @Override
    public List<StudentDocument> findByNameAndEmail_service(String name, String email) {
        return studentRepo.findByNameAndEmail(name,email);
    }
}
