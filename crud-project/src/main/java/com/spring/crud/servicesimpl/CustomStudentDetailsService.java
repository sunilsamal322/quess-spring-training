package com.spring.crud.servicesimpl;

import com.spring.crud.config.StudentCustomDetails;
import com.spring.crud.exception.StudentNotFoundException;
import com.spring.crud.models.Student;
import com.spring.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomStudentDetailsService implements UserDetailsService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student=studentRepository.findByEmail(username).orElseThrow(()->new StudentNotFoundException(username));
        return new StudentCustomDetails(student);
    }
}
