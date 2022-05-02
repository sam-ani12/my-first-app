package com.dlithe.bankingapp.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;
@Entity
    @Getter
    @Setter
    @ToString
    @Table(name="user")
    public class Users {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        @Column(name = "id")
        private int id;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "account_number")
        private String accountNumber;


        @Column(name = "mobile_number")
        private String mobileNumber;


          }

