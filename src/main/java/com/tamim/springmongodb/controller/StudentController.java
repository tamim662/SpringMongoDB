package com.tamim.springmongodb.controller;

import com.tamim.springmongodb.entity.Student;
import com.tamim.springmongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/update/{id}")
    public Student updateStudentById(@RequestBody Student student, @PathVariable String id) {
        return studentService.updateStudentById(student, id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable String id) {
        studentService.deleteStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> findAllStudent() {
        return studentService.findAllStudent();
    }

    @GetMapping("/getAllWithPagination")
    public List<Student> getAllWithPagination(@RequestParam int pageNo, @RequestParam int pageSize) {
        return studentService.getAllWithPagination(pageNo, pageSize);
    }

    @GetMapping("/allWithSorting")
    public List<Student> allWithSorting() {
        return studentService.allWithSorting();
    }

    @GetMapping("/byDepartmentName")
    public List<Student> findByDepartmentName(@RequestParam String deptName) {
        return studentService.findByDepartmentName(deptName);
    }

    @GetMapping("/bySubjectName")
    public List<Student> findBySubjectName(@RequestParam String subName) {
        return studentService.findBySubjectName(subName);
    }

}
