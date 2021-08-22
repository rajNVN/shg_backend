package com.rajCo.shg.controllers;

import com.rajCo.shg.models.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BaseController {

    @ResponseStatus(HttpStatus.OK)
    <T> Response<T> success(T result) {
        return new Response<>(null, Response.SUCCESS, null , result, null);
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    Response unauthorised(String message) {
        return new Response<>(null, Response.FAILURE,
                StringUtils.isNotBlank(message) ? message : "Unauthorised", "", null);
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    Response forbidden(String message) {
        return new Response<>(null, Response.FAILURE,
                StringUtils.isNotBlank(message) ? message : "Unauthorised" , null, null);
    }
}
