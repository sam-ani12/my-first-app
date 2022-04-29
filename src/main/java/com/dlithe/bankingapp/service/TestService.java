package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.PatientDetailsRequest;
import com.dlithe.bankingapp.dto.RegisterDetailsRequest;
import com.dlithe.bankingapp.dto.UserDetails;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String registerpatient(PatientDetailsRequest patientDetailsRequest);


    String fetchProductDetails(String productName);


    String RegisterPatient(PatientDetailsRequest patientDetailsReqest);

    String registerAgent(RegisterDetailsRequest registerDetailsRequest);
    UserDetails getUserDetails(int userId);
}

