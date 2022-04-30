package com.dlithe.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter@EqualsAndHashCode
public class UserDetails {

    private int id;
    private String name;
    private int age;
}
