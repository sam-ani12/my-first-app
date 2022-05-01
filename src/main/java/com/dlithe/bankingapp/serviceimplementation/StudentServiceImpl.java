package com.dlithe.bankingapp.serviceimplementation;


import com.dlithe.bankingapp.dto.StudentDetailRequest;
import com.dlithe.bankingapp.entity.Student;
import com.dlithe.bankingapp.repository.StudentDAO;
import com.dlithe.bankingapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class StudentServiceImpl<student> implements StudentService {
    @Autowired
    private StudentDAO studentDAO;


    @Override
    public String registerStudent(StudentDetailRequest studentDetailsRequest) {
        Student student=new Student();
        student.setStudentName(studentDetailsRequest.getStudentName());
        student.setMobileNumber(studentDetailsRequest.getMobileNumber());
        student.setRollNumber(studentDetailsRequest.getRollNumber());
        student.setAddress(studentDetailsRequest.getAddress());
        studentDAO.save(student);
        return "student details save sucessfully";
    }
}

