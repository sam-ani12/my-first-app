package com.dlithe.bankingapp.serviceimplementation;

import com.dlithe.bankingapp.dto.BaseResponse;
import com.dlithe.bankingapp.dto.UserDetailsResponse;
import com.dlithe.bankingapp.entity.Users;
import com.dlithe.bankingapp.repository.UserDAO;
import com.dlithe.bankingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private UserDAO userDAO;


    @Override
    public ResponseEntity<BaseResponse> findUserDetails(int userId) {

        BaseResponse baseResponse=new BaseResponse();
        UserDetailsResponse userDetailsResponse=new UserDetailsResponse();

        Optional<Users> users=userDAO.findById(userId);

        if(!users.isPresent()){


            baseResponse.setMessage("User ID cannot be 0 or null");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode((HttpStatus.NOT_FOUND.value()));
            baseResponse.setResponse(userDetailsResponse);

            return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.NOT_FOUND);
        }

        Users userData=users.get();

        userDetailsResponse.setFirstName(userData.getFirstName());
        userDetailsResponse.setLastName(userData.getLastName());
        userDetailsResponse.setAccountNumber(userData.getAccountNumber());
        userDetailsResponse.setMobileNumber(userData.getMobileNumber());


        baseResponse.setMessage("User found");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode((HttpStatus.OK.value()));
        baseResponse.setResponse(userDetailsResponse);



        return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.OK);
    }
    }

