package com.dlithe.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserDetailsResponse {

    private String name;
    private String age;

    private List<UserFeedbackResponse> userFeedbackResponse;

}
