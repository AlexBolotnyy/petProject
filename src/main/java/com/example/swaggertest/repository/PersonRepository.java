package com.example.swaggertest.repository;

import com.example.swaggertest.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Optional<Person> findPersonById(Integer id);
}
