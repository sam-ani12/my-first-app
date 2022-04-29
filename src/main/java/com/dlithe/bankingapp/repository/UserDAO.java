package com.dlithe.bankingapp.repository;

import com.dlithe.bankingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {

}