package com.rajCo.shg.models.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.Date;

@Setter
@Getter
@ToString
public class SignupRequest {

        private String name;

        private String phone;

        private String mail;

        private String address;

        private Date dob;

        private String occupation;

        private String fatherName;

        private String identityNumber;

        private String identityType;

        private String gender;

        private String maritalStatus;

        private String username;

        private String password;

        private String question1;

        private String question2;

        private String question3;

        private String answer1;

        private String answer2;

        private String answer3;
}
