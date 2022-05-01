package com.dlithe.bankingapp.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;

@Entity
@Setter
@Getter
@ToString
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_rollno")
    private String rollNumber;

    @Column(name = "mobile")
    private String mobileNumber;

    @Column(name = "address")
    private String address;
}
