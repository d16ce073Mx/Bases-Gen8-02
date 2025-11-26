package clases;

import java.time.LocalDate;

public class EmpleadoDeContrato extends Persona implements Empleado {
    private LocalDate fechaIngreso;
    private double salarioBase;


    public EmpleadoDeContrato(String nombre, int edad, LocalDate fechaIngreso, double salarioBase) {
        super(nombre, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSueldo() {
        return this.salarioBase * 0.65;
    }

    @Override
    public void info() {
        System.out.println( "EmpleadoDeContrato{" +
                "fechaIngreso=" + fechaIngreso +
                ", salarioBase=" + salarioBase);
    }


}
