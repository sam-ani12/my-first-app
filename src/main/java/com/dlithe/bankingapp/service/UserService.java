package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    ResponseEntity<BaseResponse> findUserDetails(int userId);


}
