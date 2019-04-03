package com.example.learning.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.learning.entities.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
@Component
public interface StudentRespository  extends JpaRepository<Student, Long>{

}
