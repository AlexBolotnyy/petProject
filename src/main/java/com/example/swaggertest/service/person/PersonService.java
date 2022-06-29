package com.example.swaggertest.service.person;

import com.example.swaggertest.model.person.PersonDto;
import com.example.swaggertest.model.person.PersonOutputDto;

public interface PersonService {

    PersonOutputDto getPersonDto(Integer id);

    void savePerson(PersonDto dto);
}
