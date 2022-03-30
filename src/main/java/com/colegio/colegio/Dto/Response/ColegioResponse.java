package com.colegio.colegio.Dto.Response;

import java.io.Serializable;

public class ColegioResponse<T> implements Serializable {

    private static final long serialVersionUID = -6052423855682343502L;

    public ColegioResponse(String status, String code, String message, T data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ColegioResponse(String status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private String code;
    private String message;
    private T data;


}
