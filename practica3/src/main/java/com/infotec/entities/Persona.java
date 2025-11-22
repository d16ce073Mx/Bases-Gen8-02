package com.infotec.entities;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private String CURP;
    private LocalDate fechaNacimiento;

    public Persona(){        
    }

    public Persona(String nombre, String paterno, String materno, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String cURP) {
        CURP = cURP;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", CURP=" + CURP
                + ", fechaNacimiento=" + fechaNacimiento + "]";
    }
    
    
    



}
