package com.example.swaggertest.model.person;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonOutputDto {

    private Integer id;

    private String firstName;

    private String secondName;

    private Integer age;
}
