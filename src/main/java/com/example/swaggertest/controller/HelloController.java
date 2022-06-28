package com.example.swaggertest.controller;

import com.example.swaggertest.model.PersonDto;
import com.example.swaggertest.model.PersonOutputDto;
import com.example.swaggertest.repository.PersonRepository;
import com.example.swaggertest.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

    private final PersonService personService;

    @GetMapping("/person-info")
    public PersonOutputDto getPersonInfo(Integer id) {

        PersonOutputDto Odto = personService.getPersonDto(id);
        return Odto;
    }

    @PostMapping("/add-person")
    public void savePerson(PersonDto dto) {

        personService.savePerson(dto);
    }
}
