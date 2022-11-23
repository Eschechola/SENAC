package br.com.senac.schedule.api.controllers;

import br.com.senac.schedule.domain.entities.Person;
import br.com.senac.schedule.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonService _personService;

    @GetMapping
    public ResponseEntity<List<Person>> getAll(){
        var persons = _personService.getAll();
        return ResponseEntity.ok().body(persons);
    }
}
