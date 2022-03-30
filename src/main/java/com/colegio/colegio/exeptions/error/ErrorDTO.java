package com.colegio.colegio.exeptions.error;

import java.io.Serializable;

public class ErrorDTO implements Serializable {

    private static final long serialVersionUID = -27173555207376680L;
    private String nombre;
    private String value;

    public ErrorDTO(String nombre, String value) {
        this.nombre = nombre;
        this.value = value;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
