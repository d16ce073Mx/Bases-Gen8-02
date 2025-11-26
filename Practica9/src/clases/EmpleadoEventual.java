package clases;

import java.time.LocalDate;

public class EmpleadoEventual extends Persona implements Empleado{
    private LocalDate fechaIngreso;
    private double salarioBase;

    public EmpleadoEventual(String nombre, int edad, LocalDate fechaIngreso, double salarioBase) {
        super(nombre, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioBase = salarioBase;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSueldo() {
        return this.salarioBase * 0.5;
    }

    @Override
    public void info() {
        System.out.println( "EmpleadoEventual{" +
                "fechaIngreso=" + fechaIngreso +
                ", salarioBase=" + salarioBase);
    }



}
