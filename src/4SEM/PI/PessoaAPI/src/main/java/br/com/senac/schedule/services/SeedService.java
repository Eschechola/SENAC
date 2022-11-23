package br.com.senac.schedule.services;

import br.com.senac.schedule.domain.entities.Person;
import br.com.senac.schedule.infrastructure.interfaces.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class SeedService {
    @Autowired
    private IPersonRepository _personRepository;

    public void seedDatabase(){
        var dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        var person1 = new Person("Lucas", "Silva", "lucas.silva@eu.com", LocalDateTime.parse("01/01/2022 00:00", dateFormat), true);
        var person2 = new Person("Gabriel", "Silva", "gabriel.silva@eu.com", LocalDateTime.parse("01/01/2022 00:00", dateFormat), true);
        var person3 = new Person("Pedro", "Silva", "pedro.silva@eu.com", LocalDateTime.parse("01/01/2022 00:00", dateFormat), true);
        var person4 = new Person("Joao", "Silva", "joao.silva@eu.com", LocalDateTime.parse("01/01/2022 00:00", dateFormat), true);

        _personRepository.saveAll(Arrays.asList(person1, person2, person3, person4));
    }
}
