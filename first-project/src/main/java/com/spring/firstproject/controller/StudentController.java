package com.spring.firstproject.controller;

import com.spring.firstproject.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(@RequestParam Integer id,@RequestParam String firstName,@RequestParam String lastName)
    {
        return new Student(id,firstName,lastName);
    }

    @GetMapping("/students")
    public List<Student> getStudentDetails()
    {
        List<Student> studentList=new ArrayList<>();

        studentList.add(new Student(1,"Shaktiraj","Das"));
        studentList.add(new Student(2,"Swadesh","Bhuyan"));
        studentList.add(new Student(3,"Sunil","samal"));
        studentList.add(new Student(4,"Ashrumochan","Das"));
        studentList.add(new Student(5,"Ashutosh","Panigrahi"));
        studentList.add(new Student(6,"Santosh","Parida"));
        studentList.add(new Student(7,"Debakanta","panda"));
        studentList.add(new Student(8,"Banamali","Behura"));
        studentList.add(new Student(9,"Ujjwal","Sahoo"));
        studentList.add(new Student(10,"Ambit","kar"));

        return studentList;
    }
}
