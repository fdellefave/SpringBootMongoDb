package it.fdellefave.demongo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories("it.fdellefave.demongo.repository")
public class DemongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemongoApplication.class, args);
    }

/*
    @Bean
    CommandLineRunner runner(StudentRepository repository){
        return args -> {

            List<String> favoriteSubject = new ArrayList<String>();
            favoriteSubject.add("Object1");
            favoriteSubject.add("Object2");

            AddressDocument address = new AddressDocument(
                    "Italy",
                    "Rome",
                    "00169"
            );

            StudentDocument student = new StudentDocument(
                    "Federico",
                    "Delle Fave",
                    "federico.dellefave@top-network.it",
                    address,
                    Gender.MALE,
                    favoriteSubject
            );

            repository.save(student);

        };
    }

 */

}
