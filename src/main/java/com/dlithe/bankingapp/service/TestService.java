package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.UserFeedbackResponse;
import com.dlithe.bankingapp.dto.UserDetailsResponse;
import org.springframework.stereotype.Component;

@Component
public interface TestService {

    UserDetailsResponse getUserDetails(int userId);

}

