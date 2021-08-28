package com.rajCo.shg.controllers;

import com.rajCo.shg.models.PersonalDetails;
import com.rajCo.shg.models.request.SignupRequest;
import com.rajCo.shg.models.response.Response;
import com.rajCo.shg.service.MemberService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MemberController extends BaseController{

    @Autowired
    private MemberService memberService;

    @PostMapping(value = "/signup")
    @ApiOperation(value = "Member signup", response = PersonalDetails.class)
    public Response signup(@ApiParam(value = "Signup details", required = true)
                          @Valid @RequestBody final SignupRequest request){
        return success(memberService.signup(request));
    }
}
