package com.rajCo.shg.controllers;

import com.rajCo.shg.models.AuthModel;
import com.rajCo.shg.utils.JWTUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    JWTUtil jwtUtil;

    @PostMapping(value = "/api/login")
    @ApiOperation(value = "Member login", response = String.class)
    public String login(@ApiParam(value = "Login credentials.", required = true)
                            @RequestBody final AuthModel auth){
        return jwtUtil.generateAccessToken(auth);
    }

    @ApiOperation(value = "Trial API", response = String.class)
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "auth", value = "Token",
            paramType = "header", required = true,
            dataTypeClass = String.class, example = "token")})
    @GetMapping(value = "/app/sample")
    public String sample(){
        return "Yes working";
    }

}
