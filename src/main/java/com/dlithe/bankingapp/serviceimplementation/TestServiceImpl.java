package com.dlithe.bankingapp.serviceimplementation;

import com.dlithe.bankingapp.dto.UserDetailsResponse;
import com.dlithe.bankingapp.dto.UserFeedbackResponse;
import com.dlithe.bankingapp.entity.User;
import com.dlithe.bankingapp.repository.UserDAO;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDetailsResponse getUserDetails(int userId) {

        UserDetailsResponse userDetails=new UserDetailsResponse();


        List<UserFeedbackResponse> userFeedbackResponseList = new ArrayList<>();

        //DB Call
        Optional<User>user = userDAO.findById(userId);
        User User1=user.get();

        userDetails.setName(User1.getName());
        userDetails.setAge(User1.getAge());

        UserFeedbackResponse feedbackResponse=new UserFeedbackResponse();

        feedbackResponse.setName("Samanvitha");
        feedbackResponse.setRating(5);
        userFeedbackResponseList.add(feedbackResponse);

        UserFeedbackResponse feedbackResponse1=new UserFeedbackResponse();
        feedbackResponse1.setName("Sandhya");
        feedbackResponse1.setRating(2);
        userFeedbackResponseList.add(feedbackResponse1);


        userDetails.setUserFeedbackResponse(userFeedbackResponseList);
        return userDetails;

    }



}



