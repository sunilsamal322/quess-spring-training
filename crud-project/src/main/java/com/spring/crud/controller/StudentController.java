package com.spring.crud.controller;

import com.spring.crud.models.Student;
import com.spring.crud.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @PostMapping("/")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student)
    {
        return new ResponseEntity<>(studentServices.saveStudent(student), HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents()
    {
        return new ResponseEntity<>(studentServices.getAllStudents(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id)
    {
        return new ResponseEntity<>(studentServices.getStudentById(id),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Integer id,@RequestBody Student student)
    {
        return new ResponseEntity<>(studentServices.updateStudent(student,id),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id)
    {
        studentServices.deleteStudent(id);
        return new ResponseEntity<>("student deleted successfully",HttpStatus.OK);
    }
}
