package com.colegio.colegio.exeptions;

import com.colegio.colegio.exeptions.error.ErrorDTO;

import java.util.ArrayList;
import java.util.List;


public class ColegioException extends Exception{

    private final String code;
    private final int responseCode;

    private final List<String> errorList =new ArrayList<>();


    public ColegioException(String code, int responseCode, String message) {
        super(message);
        this.code = code;
        this.responseCode = responseCode;
    }

    public ColegioException(String code, int responseCode, String message, List<ErrorDTO> asList) {
        super(message);
        this.code = code;
        this.responseCode = responseCode;

    }
}
