package com.spring.crud.repository;

import com.spring.crud.models.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Optional<Student> findByEmail(String email);

}
