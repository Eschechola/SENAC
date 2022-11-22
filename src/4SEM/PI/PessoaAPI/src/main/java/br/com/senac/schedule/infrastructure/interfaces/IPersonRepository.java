package br.com.senac.schedule.infrastructure.interfaces;

import br.com.senac.schedule.domain.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Integer>
{}
