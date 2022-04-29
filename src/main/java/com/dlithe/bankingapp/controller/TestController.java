package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.UserFeedbackResponse;
import com.dlithe.bankingapp.dto.UserDetailsResponse;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {


    @Autowired
    private TestService testService;

    @GetMapping("get-user-details/{userId}")
    public UserDetailsResponse fetchUserDetails(@PathVariable int userId){
        return testService.getUserDetails(userId);
    }

}
