package com.dlithe.bankingapp.entity;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class Users {
        @Id
        private int id;

        private String accountNumber;
        private String firstName;
        private String lastName;
        private String mobileNumber;
        private String emailId;

    }


