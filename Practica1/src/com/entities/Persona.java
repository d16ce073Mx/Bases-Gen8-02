package com.entities;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private LocalDate fechaNacimiento;
    private Direccion direccion;

    public int getEdad(){
        LocalDate today = LocalDate.now();
        LocalDate birthDate = this.getFechaNacimiento();
        Period age = Period.between(birthDate, today);
        return age.getYears();
    };

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
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
