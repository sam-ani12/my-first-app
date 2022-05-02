package com.dlithe.bankingapp.repository;

import com.dlithe.bankingapp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<Users,Integer> {


}
