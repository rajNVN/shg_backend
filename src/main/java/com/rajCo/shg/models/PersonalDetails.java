package com.rajCo.shg.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class PersonalDetails {

    private String username;

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

}
