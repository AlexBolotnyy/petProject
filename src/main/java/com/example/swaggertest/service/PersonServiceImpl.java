package com.example.swaggertest.service;

import com.example.swaggertest.entity.Person;
import com.example.swaggertest.model.PersonDto;
import com.example.swaggertest.model.PersonOutputDto;
import com.example.swaggertest.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;


    @Override
    public PersonOutputDto getPersonDto(Integer id) {
        Person person = personRepository.findPersonById(id).orElse(new Person());
        PersonOutputDto dto = new PersonOutputDto();
        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setSecondName(person.getSecondName());
        dto.setAge(person.getAge());
        return dto;
    }

    @Override
    public void savePerson(PersonDto dto) {
        Person person = new Person();
        person.setAge(dto.getAge());
        person.setFirstName(dto.getFirstName());
        person.setSecondName(dto.getSecondName());
        personRepository.save(person);
    }

}
