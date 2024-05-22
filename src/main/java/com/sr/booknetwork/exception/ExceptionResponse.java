package com.sr.booknetwork.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExceptionResponse {

    private String  error;
    private Integer businessErrorCode;
    private String  businessErrorDescription;
    private Set<String> validationErrors;
    private Map<String, String> errors;


}
