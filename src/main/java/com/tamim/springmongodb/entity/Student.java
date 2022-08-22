package com.tamim.springmongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "student")
public class Student {
    @Id
    private String id;

    private String name;
    @Field(name = "mail")
    private String email;

    private Department department;

    private List<Subject> subjects;

    @Transient // To skip this field to save and update in student collection
    private double percentage;

    public double getPercentage() {
        double total  = 0;
        if(subjects.size() > 0) {
            for (Subject subject: subjects) {
                total += subject.getMarksObtained();
            }
            return total/subjects.size();
        }
        return 0.0;
    }

}
