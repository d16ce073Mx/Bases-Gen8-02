package com.entities;

public class Universidad {
    private String nombre;
    private String ciudad;

    // Constructor
    public Universidad(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    // Getters y Setters (métodos de acceso)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Método toString para una fácil visualización
    @Override
    public String toString() {
        return "Universidad{" +
               "nombre='" + nombre + '\'' +
               ", ciudad='" + ciudad + '\'' +
               '}';
    }
}