package com.example.swaggertest.model.person.mapper;

import com.example.swaggertest.entity.person.Person;
import com.example.swaggertest.model.person.PersonOutputDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "secondName", source = "secondName")
    @Mapping(target = "age", source = "age")
    PersonOutputDto toDto(Person person);


}
