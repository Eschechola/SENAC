package br.com.senac.schedule.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.schedule.infrastructure.interfaces.IPersonRepository;
import br.com.senac.schedule.domain.entities.Person;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private IPersonRepository _personRepository;

    public Person findById(int id){
        var person = _personRepository.findById(id);
        return person.orElse(null);
    }

    public List<Person> getAll(){
        var persons = _personRepository.findAll();
        return persons;
    }

    public Person save(Person person){
        return _personRepository.save(person);
    }

    public Person update(int id, Person person){
        var personToUpdate = findById(id);

        if(personToUpdate == null)
            return null;

        personToUpdate.setFirstName(person.getFirstName());
        personToUpdate.setLastName(person.getLastName());
        personToUpdate.setEmail(person.getEmail());
        personToUpdate.setAge(person.getAge());

        return _personRepository.save(personToUpdate);
    }
}
