package com.rajCo.shg.configurations;

import com.rajCo.shg.models.response.CustomFieldError;
import com.rajCo.shg.models.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice("com.rajCo.shg")
@Slf4j
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ Exception.class })
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public final Response handleAll(final Exception ex) {
        log.error("Exception catch at handler ex:", ex);
        return new Response(Response.FAILURE, 500, ex.getMessage());
    }

    @ExceptionHandler({ DataAccessException.class })
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public final Response handleDataAccessException(final DataAccessException ex) {
        log.error("DataAccessException catch at handler ex:", ex);
        return new Response(Response.FAILURE, 500, ex.getMessage());
    }

    @ExceptionHandler({ CommonException.class })
    public final ResponseEntity<Object> handleBusinessException(final CommonException ex) {
        Integer errorCode = null;
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        switch (ex.getCode()) {
            case 1001: //login error
                httpStatus = HttpStatus.UNAUTHORIZED;
                break;
            case 1002: // data not found
                httpStatus = HttpStatus.BAD_REQUEST;
                break;
            default:
                log.error("An unhandled exception, message: {}", ex.getMessage(), ex);
        }
        final Response response = new Response(Response.FAILURE, errorCode, ex.getMessage(), ex.getErrors());
        return new ResponseEntity<>(response, httpStatus);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            final MethodArgumentNotValidException ex, final HttpHeaders headers,
            final HttpStatus status, final WebRequest request) {
        log.error("handleMethodArgumentNotValid exception:", ex);
        final Response response = new Response(Response.FAILURE, 1003, "Invalid request");
        for (final FieldError error : ex.getBindingResult().getFieldErrors()) {
            if (null != error && StringUtils.isNotBlank(error.getDefaultMessage())) {
                response.addError(new CustomFieldError(error.getField(), error.getDefaultMessage()));
            }
        }
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }


}
