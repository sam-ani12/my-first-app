package com.dlithe.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StudentDetailRequest
{
    private String id;
    private String studentName;
    private String rollNumber;
    private String mobileNumber;
    private String address;
}
