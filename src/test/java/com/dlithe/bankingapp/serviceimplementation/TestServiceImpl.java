package com.dlithe.bankingapp.serviceimplementation;

import com.dlithe.bankingapp.dto.PatientDetailsRequest;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String registerpatient(PatientDetailsRequest patientDetailsRequest) {
        System.out.println(patientDetailsRequest);
        return null;
    }

    @Override
    public String fetchProductDetails(String productName) {
        if (productName != null) {
            switch (productName) {
                case "A":
                    return "Best quality products";
                case "B":
                    return "Good quality products";
                case "c":
                    return "Low quality products";
                default:
                    return "No product found";
            }
        } else {
            return "Product name cannot be null";


        }

    }



}



