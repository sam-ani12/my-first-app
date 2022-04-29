package com.dlithe.bankingapp.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class RegisterDetailsRequest {
    private int id;
    private String name;
    private String age;
}


