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
public class Subject {
    @Field(name= "subject_name")
    private String subjectName;

    @Field(name = "marks")
    private int marksObtained;
}
