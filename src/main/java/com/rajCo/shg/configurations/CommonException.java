package com.rajCo.shg.configurations;

import com.rajCo.shg.models.response.CustomFieldError;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommonException extends RuntimeException {

    private static final long serialVersionUID = -87686787678657L;

    private int code;
    private String message;
    private List<CustomFieldError> errors;

    public static CommonException newCommonException(Integer code, String errorMessage, final List<CustomFieldError> errors){
        return new CommonException(null == code ? 500 : code, StringUtils.isNoneBlank(errorMessage)
                ? errorMessage : "Unhandled exception", errors);
    }

}
