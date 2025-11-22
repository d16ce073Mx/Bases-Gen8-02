package com.infotec;
import com.infotec.Persona; 

import java.time.LocalDate;

public abstract class Trabajador extends Persona {
    private String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    public LocalDate getFechaNacimiento() {
        return super.getFechaNacimiento();
    }

    @Override
    public String getMaterno() {
        return super.getMaterno();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getPaterno() {
        return super.getPaterno();
    }

    @Override
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        super.setFechaNacimiento(fechaNacimiento);
    }

    @Override
    public void setMaterno(String materno) {
        super.setMaterno(materno);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setPaterno(String paterno) {
        super.setPaterno(paterno);
    }

    

} 
