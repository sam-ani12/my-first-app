package com.dlithe.bankingapp.serviceimplementation;

import com.dlithe.bankingapp.dto.PatientDetailsRequest;
import com.dlithe.bankingapp.dto.RegisterDetailsRequest;
import com.dlithe.bankingapp.dto.UserDetails;
import com.dlithe.bankingapp.entity.User;
import com.dlithe.bankingapp.repository.UserDAO;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserDAO userDAO;

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

    @Override
    public String RegisterPatient(PatientDetailsRequest patientDetailsReqest) {
        return null;
    }

    @Override
    public String registerAgent(RegisterDetailsRequest registerDetailsRequest) {
        User user= new User();

        user.setName(registerDetailsRequest.getName());
        user.setAge(registerDetailsRequest.getAge());

        userDAO.save(user);
        return "added successfully";
    }


//override
@Override
public UserDetails getUserDetails(int userId) {
    Optional<User> users = userDAO.findById(userId);
    User user = users.get();
    UserDetails userDetails = new UserDetails();
    userDetails.setName(user.getName());
    userDetails.setAge(user.getAge());

    return userDetails;

}
}










