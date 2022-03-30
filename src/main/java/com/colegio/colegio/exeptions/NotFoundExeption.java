package com.colegio.colegio.exeptions;

import com.colegio.colegio.exeptions.error.ErrorDTO;
import org.springframework.http.HttpStatus;

import java.util.Arrays;

public class NotFoundExeption extends ColegioException {

    public NotFoundExeption(String code, String message) {
        super(code, HttpStatus.NOT_FOUND.value(), message);
    }


    public NotFoundExeption(String code, String message, ErrorDTO data) {
        super(code, HttpStatus.NOT_FOUND.value(), message, Arrays.asList(data));
    }
}
