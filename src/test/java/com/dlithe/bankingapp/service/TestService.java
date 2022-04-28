package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.PatientDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String registerpatient(PatientDetailsRequest patientDetailsRequest);


    String fetchProductDetails(String productName);


}

