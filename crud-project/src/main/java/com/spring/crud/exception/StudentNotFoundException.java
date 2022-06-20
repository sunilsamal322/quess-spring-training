package com.spring.crud.exception;


public class StudentNotFoundException extends RuntimeException {

    private Integer studentId;
    private String email;

    public StudentNotFoundException(Integer studentId) {
        super(String.format("Student not found with id %s", studentId));
        this.studentId = studentId;
    }
    public StudentNotFoundException(String email) {
        super(String.format("Student not found with email %s", email));
        this.email=email;
    }
}

