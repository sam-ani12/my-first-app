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
public class AccountDetails {

    @Id
    private int id;
    private String type;

    private String accountName;

}
