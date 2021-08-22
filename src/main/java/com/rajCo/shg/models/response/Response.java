package com.rajCo.shg.models.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.*;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    public static final String SUCCESS = "success";
    public static final String FAILURE = "failure";

    private Integer code;
    private String event;
    private String message;
    //for json results
    private T result;
    //for field errors
    private List<CustomFieldError> errors;

    public final void addError(final CustomFieldError baseError) {
        if (null == errors) {
            errors = new ArrayList<>();
        }
        errors.add(baseError);
    }

    public Response(final String event, final T result) {
        this(null, event, null, result, null);
    }

    public Response(final String event, final Integer code) {
        this(code, event, null, null, null);
    }

    public Response(final String event, final Integer code, final String message) {
        this(code, event, message, null, null);
    }

    public Response(final String event, final Integer code, final String message,
                    final List<CustomFieldError> errors) {
        this(code, event, message, null, errors);
    }
}
