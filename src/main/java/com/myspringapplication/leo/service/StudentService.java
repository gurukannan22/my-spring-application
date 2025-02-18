package com.myspringapplication.leo.service;

import com.myspringapplication.leo.entity.Student;
import com.myspringapplication.leo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudent() {
        return repository.findAll();
    }

    public Student saveEmployee(Student student) {
        return repository.save(student);
    }
}
