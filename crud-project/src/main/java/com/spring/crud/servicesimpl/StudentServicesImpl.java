package com.spring.crud.servicesimpl;

import com.spring.crud.exception.StudentNotFoundException;
import com.spring.crud.models.Student;
import com.spring.crud.repository.StudentRepository;
import com.spring.crud.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicesImpl implements StudentServices {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {

        Student student=studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException(id));
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student, Integer id) {
        Student existingStudent=studentRepository.findById(id).orElseThrow(()-> new StudentNotFoundException(id));
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setRollNumber(student.getRollNumber());
        existingStudent.setGender(student.getGender());
        studentRepository.save(existingStudent);
        return existingStudent;
    }

    @Override
    public void deleteStudent(Integer id) {
        Student student=this.studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException(id));
        studentRepository.delete(student);
    }
}
