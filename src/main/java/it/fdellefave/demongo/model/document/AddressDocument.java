package it.fdellefave.demongo.model.document;

import it.fdellefave.demongo.model.Coord;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@Document(collection = "address")
public class AddressDocument {

    @Id
    private String idAddress;

    private String building;
    private String street;

    @Field(name = "coord")
    private Coord[] coord;

    @Field(name = "zipcode")
    private String zipCode;

    public AddressDocument(String building, Coord[] coord, String street, String zipCode) {
        this.building = building;
        this.coord = coord;
        this.street = street;
        this.zipCode = zipCode;
    }
}
