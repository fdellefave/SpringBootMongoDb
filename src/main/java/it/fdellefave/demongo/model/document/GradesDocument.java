package it.fdellefave.demongo.model.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "grades")
public class GradesDocument {

    @Id
    private String idGrades;
    private Date date;
    private String grade;
    private int score;

    public GradesDocument(Date date, String grade, int score) {
        this.date = date;
        this.grade = grade;
        this.score = score;
    }
}
