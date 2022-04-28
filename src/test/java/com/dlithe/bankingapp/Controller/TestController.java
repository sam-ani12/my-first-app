package com.dlithe.bankingapp.Controller;

import com.dlithe.bankingapp.dto.PatientDetailsRequest;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("fetch-Product-Details/{productName}")
    public String myFirstMethod(@PathVariable String productName) {
        String result = testService.fetchProductDetails(productName);
        return result;
    }
    @PostMapping("register-patient")
    public String registerNewPatient(@RequestBody PatientDetailsRequest patientDetailsRequest){
        return testService.registerpatient(patientDetailsRequest);
    }
}

//    @GetMapping("test")
//    public String myFirstMethod() {
//        return "Welcome to java";
//    }

//    @GetMapping("details/{productNames}")
//    public String cosmetics(@PathVariable String productNames) {
//        switch (productNames) {
//            case "saress":
//                return saressDetails();
//            case "makeup":
//                return makeupDetails();
//            default:
//                return "Not Found";
//        }
//
//    }
//
//    public String saressDetails() {
//        return "Saress is the best in the market with price varying from 500-10000 INR";
//    }
//
//    public String makeupDetails() {
//        return "Limited edition makeup with only 8 pieces in stock all over the world";
//    }
//}
//

