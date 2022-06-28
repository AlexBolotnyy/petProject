package com.example.swaggertest.service;

import com.example.swaggertest.model.PersonDto;
import com.example.swaggertest.model.PersonOutputDto;

public interface PersonService {

    PersonOutputDto getPersonDto(Integer id);

    void savePerson(PersonDto dto);
}
