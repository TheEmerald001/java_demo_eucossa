package dao;

import org.springframework.stereotype.Repository;

import com.example.learning.entities.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRespository  extends JpaRepository<Student, Long>{

}
