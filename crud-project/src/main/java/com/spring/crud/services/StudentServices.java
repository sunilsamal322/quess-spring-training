package com.spring.crud.services;

import com.spring.crud.models.Student;

import java.util.List;

public interface StudentServices {

    Student saveStudent(Student student);

    Student getStudentById(Integer id);

    List<Student> getAllStudents();

    Student updateStudent(Student student,Integer id);

    void deleteStudent(Integer id);
}
