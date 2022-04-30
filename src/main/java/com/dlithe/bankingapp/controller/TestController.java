package com.dlithe.bankingapp.controller;


import com.dlithe.bankingapp.dto.RegisterDetailsRequest;
import com.dlithe.bankingapp.dto.UserDetails;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("test")
    public String myFirstMethod() {
        return "Hey guys!!! Its me, Springboot endpoint response";
    }


    @Autowired
    private TestService testService;

    //    @PostMapping("register-user")
//    public String registerNewAgent(@RequestBody RegisterDetailsRequest registerDetailsRequest){
//        return testService.registerAgent(registerDetailsRequest);
//    }
    @GetMapping("user-details/{userName}")
    public UserDetails fetchUserDetailsBasedOnUserName(@PathVariable String userName) {
        return testService.fetchUserDetailsBasedOnUserName(userName);
    }

}

