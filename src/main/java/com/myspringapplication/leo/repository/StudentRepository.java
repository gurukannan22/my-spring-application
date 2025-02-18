package com.myspringapplication.leo.repository;

import com.myspringapplication.leo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
