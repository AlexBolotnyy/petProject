package com.example.swaggertest.service.person;

import com.example.swaggertest.entity.person.Person;
import com.example.swaggertest.model.person.PersonDto;
import com.example.swaggertest.model.person.PersonOutputDto;
import com.example.swaggertest.model.person.mapper.PersonMapper;
import com.example.swaggertest.repository.person.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    @Override
    public PersonOutputDto getPersonDto(Integer id) {
        Person person = personRepository.findPersonById(id).orElse(new Person());
        return personMapper.toDto(person);
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
