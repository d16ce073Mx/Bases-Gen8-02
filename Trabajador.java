package com.infotec;

public abstract class Trabajador extends Persona {
    private String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String rFC) {
        RFC = rFC;
    }

    @Override
    public String getFechaNacimiento() {
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
    public void setFechaNacimiento(String fechaNacimiento) {
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
