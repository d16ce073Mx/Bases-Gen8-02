package Clases;

public class Estudiante {
    //Antonio, 68, yo, paso, 8.2
    private String nombre;
    private int edad;
    private String colegio;
    private String status;
    private double promedio;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, String colegio, String status, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.colegio = colegio;
        this.status = status;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", colegio='" + colegio + '\'' +
                ", status='" + status + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
