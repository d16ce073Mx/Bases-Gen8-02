package com.infotec;

public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private Domicilio domicilio;

    

   
    

    public Persona(String nombre, String paterno, String materno, Domicilio domicilio) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.domicilio = domicilio;
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPaterno() {
        return paterno;
    }
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public String getMaterno() {
        return materno;
    }
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public Domicilio getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    } 

    

}
