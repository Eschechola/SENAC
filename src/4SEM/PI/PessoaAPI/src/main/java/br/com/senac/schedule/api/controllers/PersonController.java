package br.com.senac.schedule.api.controllers;

import br.com.senac.schedule.domain.entities.Person;
import br.com.senac.schedule.services.PersonService;
import br.com.senac.schedule.services.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonService _personService;

    @Autowired
    private SeedService _seedService;

    @GetMapping(value="/seed")
    public ResponseEntity seed(){
        _seedService.seedDatabase();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(value = "/get-all")
    public ResponseEntity<List<Person>> getAll(){
        var persons = _personService.getAll();
        return ResponseEntity.ok().body(persons);
    }

    @GetMapping(value = "/find-by-id/{id}")
    public ResponseEntity<Person> findById(@PathVariable int id){
        var person = _personService.findById(id);
        return ResponseEntity.ok().body(person);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity deleteById(@PathVariable int id){
        _personService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Person> create(@RequestBody Person person){
        var createdPerson = _personService.create(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPerson);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Person> update(@PathVariable int id, @RequestBody Person person){
        var updatedPerson = _personService.update(id, person);
        return ResponseEntity.ok().body(updatedPerson);
    }
}
