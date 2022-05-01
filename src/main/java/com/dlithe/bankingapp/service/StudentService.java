package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.StudentDetailRequest;
import org.springframework.stereotype.Component;

@Component
public interface StudentService{
    String registerStudent(StudentDetailRequest studentDetailsRequest);

}
