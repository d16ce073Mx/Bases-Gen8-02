package com.entities;

public class EstudianteUniversitario extends Estudiante {
    private Universidad universidad;
    private String carrera;


    public void servicioSocial(){}
    public void PracticasProfesionales(){}
    
    public Universidad getUniversidad() {
        return universidad;
    }
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public EstudianteUniversitario(Universidad universidad, String carrera) {
        this.universidad = universidad;
        this.carrera = carrera;
    }
    @Override
    public String toString() {
        return "EstudianteUniversitario [universidad=" + universidad + ", carrera=" + carrera + ", getEdad()="
                + getEdad() + ", getUniversidad()=" + getUniversidad() + ", getCarrera()=" + getCarrera()
                + ", getNombre()=" + getNombre() + ", getPaterno()=" + getPaterno() + ", getMaterno()=" + getMaterno()
                + ", getFechaNacimiento()=" + getFechaNacimiento() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

    
}
