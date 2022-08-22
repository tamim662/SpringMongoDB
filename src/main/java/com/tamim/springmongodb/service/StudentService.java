package com.tamim.springmongodb.service;

import com.tamim.springmongodb.entity.Student;
import com.tamim.springmongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id);
    }

    public Student updateStudentById(Student student, String id) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }

    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    public List<Student> getAllWithPagination(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        return studentRepository.findAll(pageable).getContent();
    }

    public List<Student> allWithSorting() {
        Sort sort = Sort.by(Sort.Direction.ASC, "name"); // sorting by name field

        return studentRepository.findAll(sort);
    }

    public List<Student> findByDepartmentName(String deptName) {
        return studentRepository.findByDepartment_DepartmentName(deptName);
    }

    public List<Student> findBySubjectName(String subName) {
        return studentRepository.findBySubjectsSubjectName(subName);
    }
}
