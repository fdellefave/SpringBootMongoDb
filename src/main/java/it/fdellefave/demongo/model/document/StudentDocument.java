package it.fdellefave.demongo.model.document;

import it.fdellefave.demongo.model.Gender;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "student")
public class StudentDocument {

    @Id
    private String idStudent;

    private String name;
    private String surname;
    private String email;

    private AddressDocument addressDocument;
    private Gender gender;

    @Field(name = "favorite_subjects")
    private List<String> favoriteSubjects;


    public StudentDocument(String name, String surname, String email, AddressDocument addressDocument, Gender gender, List<String> favoriteSubjects) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.addressDocument = addressDocument;
        this.gender = gender;
        this.favoriteSubjects = favoriteSubjects;
    }

}
