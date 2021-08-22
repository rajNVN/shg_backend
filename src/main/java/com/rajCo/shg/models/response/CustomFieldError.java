package com.rajCo.shg.models.response;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomFieldError {

    private String field;
    private String error;

}
