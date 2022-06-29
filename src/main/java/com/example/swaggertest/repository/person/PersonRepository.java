package com.example.swaggertest.repository.person;

import com.example.swaggertest.entity.person.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Optional<Person> findPersonById(Integer id);
}
