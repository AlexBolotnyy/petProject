package com.example.swaggertest.controller.person;

import com.example.swaggertest.model.person.PersonDto;
import com.example.swaggertest.model.person.PersonOutputDto;
import com.example.swaggertest.service.person.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/info")
    public PersonOutputDto getPersonInfo(Integer id) {

        return personService.getPersonDto(id);
    }

    @PostMapping("/add")
    public void savePerson(PersonDto dto) {

        personService.savePerson(dto);
    }
}
