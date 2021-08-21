package com.rajCo.shg.models;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class AuthModel {

    private String userId;

    private String username;

    private String password;

    private boolean isAdmin;
}
