package com.spring.crud.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students_record")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "roll_number")
    private String rollNumber;
    @Column(name = "gender")
    private String gender;
}
