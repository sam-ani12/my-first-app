package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.StudentDetailRequest;
import com.dlithe.bankingapp.entity.Student;
import com.dlithe.bankingapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


        @Autowired
        private StudentService studentService;

        @PostMapping("student-details")
        public String displayStudentDetails(@RequestBody StudentDetailRequest studentDetailsRequest) {
            return studentService.registerStudent(studentDetailsRequest);
        }
    }



