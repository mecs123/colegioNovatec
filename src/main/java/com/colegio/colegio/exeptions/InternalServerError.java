package com.colegio.colegio.exeptions;

import com.colegio.colegio.exeptions.error.ErrorDTO;
import org.springframework.http.HttpStatus;

import java.util.List;

public class InternalServerError extends ColegioException {


    public InternalServerError(String code, int responseCode, String message) {
        super(code, HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }

    public InternalServerError(String code, int responseCode, String message, List<ErrorDTO> asList) {
        super(code, HttpStatus.INTERNAL_SERVER_ERROR.value(), message, asList);
    }
}
