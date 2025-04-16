package com.myspringapplication.leo.service;

import com.myspringapplication.leo.entity.StudentEntity;
import com.myspringapplication.leo.model.StudentResponse;
import com.myspringapplication.leo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentJPAService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentResponse studentResponse;


    public ResponseEntity<StudentResponse> addStudent(StudentEntity student){
        Optional<StudentEntity> existingStudent = studentRepository.findById(student.getStudentId());
        if (existingStudent.isPresent()) {
            String existingStudentName = existingStudent.get().getFirstName();
            studentResponse.setStatus("Failed");
            studentResponse.setMessage("The StudentEntity ID (" + student.getStudentId() + ") you entered belongs to (" +
                    existingStudentName + "), Please enter a unique ID.");
            return new ResponseEntity<>(studentResponse,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        studentRepository.save(student);
        studentResponse.setStatus("Success");
        studentResponse.setMessage("✅ StudentEntity added successfully!");

        return new ResponseEntity<>(studentResponse,HttpStatus.CREATED);
    }

    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

}
