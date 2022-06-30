package com.shop.service.person;

import com.shop.model.person.PersonDto;
import com.shop.model.person.PersonOutputDto;

public interface PersonService {

    PersonOutputDto getPersonDto(Integer id);

    void savePerson(PersonDto dto);
}
