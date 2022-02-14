package it.fdellefave.demongo.model.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "restaurant")
public class RestaurantDocument {

    @Id
    private String idRestaurant;

    private String borough;
    private String cuisine;
    private String name;
    private String email;

    @DBRef
    private AddressDocument addressDocument;

    @DBRef
    private List<GradesDocument> gradeDocuments;

    public RestaurantDocument(AddressDocument addressDocument, String borough, String cuisine, List<GradesDocument> gradeDocuments, String name, String email) {
        this.addressDocument = addressDocument;
        this.borough = borough;
        this.cuisine = cuisine;
        this.gradeDocuments = gradeDocuments;
        this.name = name;
        this.email = email;
    }
}
