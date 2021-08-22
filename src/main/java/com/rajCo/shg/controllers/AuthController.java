package com.rajCo.shg.controllers;

import com.rajCo.shg.AuthService;
import com.rajCo.shg.entities.Auth;
import com.rajCo.shg.models.AuthModel;
import com.rajCo.shg.models.response.Response;
import com.rajCo.shg.repositories.AuthDao;
import com.rajCo.shg.utils.JWTUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
public class AuthController extends BaseController{

    @Autowired
    JWTUtil jwtUtil;

    @Autowired
    AuthService authService;

    @PostMapping(value = "/api/login")
    @ApiOperation(value = "Member login", response = String.class)
    public Response login(@ApiParam(value = "Login credentials.", required = true)
                            @Valid @RequestBody final AuthModel request, HttpServletResponse response){
        return success(authService.getAuthToken(request));
    }

    @GetMapping(value = "auth-details")
    @ApiOperation(value = "auth details", response = AuthModel.class)
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "auth", value = "Token", paramType = "header",
            required = true, dataTypeClass = String.class, example = "token")})
    public Response getAuthDetails(final HttpServletRequest request, final HttpServletResponse response){
        String token = request.getHeader("auth");
        if(StringUtils.isNotBlank(token)){
            try {
                return success(jwtUtil.getUserFromToken(token));
            } catch (Exception e){
                return forbidden("Token not correct!!!");
            }
        }
        else {
            return forbidden("Token not found!!!");
        }
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
