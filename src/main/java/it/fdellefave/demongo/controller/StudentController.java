package it.fdellefave.demongo.controller;

import it.fdellefave.demongo.model.document.StudentDocument;
import it.fdellefave.demongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/getAll")
    public Iterable<StudentDocument> getAll() {
        return service.getAll();
    }


    /**http://localhost:8080/student/getByNameAndEmail?name=Antonino&email=Anto.Cannava@top-network.it*/
    @GetMapping("/getByNameAndEmail")
    public List<StudentDocument> getStudentByNameAndEmail(@RequestParam String name, @RequestParam String email){return service.findByNameAndEmail_service(name,email);}





    @PostMapping("/create")
    public String create(@RequestBody StudentDocument document){
        return service.create(document);
    }

    @PutMapping("/update/{id}")
    public String update(@RequestBody StudentDocument document, @PathVariable String id){
        return service.update(document,id);
    }
}
