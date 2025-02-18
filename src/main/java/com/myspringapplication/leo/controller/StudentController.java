package com.myspringapplication.leo.controller;

import com.myspringapplication.leo.entity.Student;
import com.myspringapplication.leo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudent();
    }

    @PostMapping
    public Student addstudent(@RequestBody Student student) {
        return service.saveEmployee(student);
    }
}



