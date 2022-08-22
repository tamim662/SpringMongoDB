package com.tamim.springmongodb.repository;

import com.tamim.springmongodb.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {
    Student findById(String id);
    void deleteById(String id);

    List<Student> findByDepartment_DepartmentName(String deptName);

    List<Student> findBySubjectsSubjectName(String subName);
}
