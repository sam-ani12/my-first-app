package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.UserDetails;
import org.springframework.stereotype.Component;

@Component
public interface TestService {


    UserDetails fetchUserDetailsBasedOnName(String userName);

    UserDetails fetchUserDetailsBasedOnUserName(String userName);
}


