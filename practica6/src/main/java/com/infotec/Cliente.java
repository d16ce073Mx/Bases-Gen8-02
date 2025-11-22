package com.infotec;

public class Cliente {
    private String nombre;
    private String RFC;
    private String correo;


    public Cliente(String RFC, String nombre, String correo) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String rFC) {
        RFC = rFC;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    

}
