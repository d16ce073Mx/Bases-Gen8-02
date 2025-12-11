package org.infotec.model;

public class Cliente {
    private String numeroCliente;
    private String nombre;
    private String paterno;
    private String materno;
    private String RFC;
    private Direccion direccion;
    private String correo;

    public Cliente(Direccion direccion, String correo, String numeroCliente, String nombre,  String RFC) {
        this.numeroCliente = numeroCliente;
        this.direccion = direccion;
        this.nombre = nombre;
        this.RFC = RFC;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
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

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
