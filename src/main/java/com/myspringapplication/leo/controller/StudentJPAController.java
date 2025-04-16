package com.myspringapplication.leo.controller;

import com.myspringapplication.leo.entity.StudentEntity;
import com.myspringapplication.leo.model.StudentResponse;
import com.myspringapplication.leo.service.StudentJPAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("jpa/student")
public class StudentJPAController {

    @Autowired
    private StudentJPAService studentJPAService;

    @PostMapping("save")
    public ResponseEntity<StudentResponse> saveStudentToDB(@RequestBody StudentEntity student){
    return studentJPAService.addStudent(student);
    }

    @GetMapping("getAll")
    public List<StudentEntity> getStudentsAll(){
        return studentJPAService.getAllStudents();
    }
}
