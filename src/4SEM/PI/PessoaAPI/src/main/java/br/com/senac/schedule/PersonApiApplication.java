package br.com.senac.schedule;

import br.com.senac.schedule.services.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonApiApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(PersonApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{}

}
