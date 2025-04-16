package com.myspringapplication.leo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="student_details")
@Data
public class StudentEntity {

    @Id
    private int studentId;

    private String firstName;
    private String lastName;
    private int age;
    private String grade;
}
