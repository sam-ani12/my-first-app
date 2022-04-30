package com.dlithe.bankingapp.serviceimplementation;



import com.dlithe.bankingapp.dto.UserDetails;
import com.dlithe.bankingapp.entity.User;
import com.dlithe.bankingapp.repository.UserDAO;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public UserDetails fetchUserDetailsBasedOnName(String userName) {
        return null;
    }

    @Override
    public UserDetails fetchUserDetailsBasedOnUserName(String userName) {

        UserDetails userDetailsRequest = new UserDetails();

        User user = userDAO.findByName(userName);

        userDetailsRequest.setId(user.getId());
        userDetailsRequest.setAge(user.getAge());
        userDetailsRequest.setName(user.getName());


        return userDetailsRequest;
    }
}



