package com.shop.repository.person;

import com.shop.entity.person.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Optional<Person> findPersonById(Integer id);
}
