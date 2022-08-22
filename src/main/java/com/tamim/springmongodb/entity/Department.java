package com.tamim.springmongodb.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Department {
    @Field(name = "department_name")
    private String departmentName;

    private String location;
}
