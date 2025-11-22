package com.infotec.entities;

import java.time.LocalDate;

public abstract class Empleado extends Persona{
    private double salarioBruto;
    private double salarioNeto;
    private double deducciones;
    private double bono;

    public Empleado() {
    }

    public Empleado(String nombre, String paterno, String materno, LocalDate fechaNacimiento, double salarioBruto, double salarioNeto) {
        super(nombre, paterno, materno, LocalDate.of(2000, 1, 1));
        this.salarioBruto = salarioBruto;
        this.salarioNeto = salarioNeto;
    }

        public double getSalarioBruto() {
            return salarioBruto;
        }

        public void setSalarioBruto(double salarioBruto) {
            this.salarioBruto = salarioBruto;
        }

        public double getSalarioNeto() {
            return salarioNeto;
        }

        public void setSalarioNeto(double salarioNeto) {
            this.salarioNeto = salarioNeto;
        }

        public double getDeducciones() {
            return deducciones;
        }

        public void setDeducciones(double deducciones) {
            this.deducciones = deducciones;
        }

        public double getBono() {
            return bono;
        }

        public void setBono(double bono) {
            this.bono = bono;
        }

        @Override
        public String toString() {
            return "Empleado [salarioBruto=" + salarioBruto + ", salarioNeto=" + salarioNeto + ", deducciones="
                    + deducciones + ", bono=" + bono + ", getNombre()=" + getNombre() + ", getSalarioBruto()="
                    + getSalarioBruto() + ", getPaterno()=" + getPaterno() + ", getSalarioNeto()=" + getSalarioNeto()
                    + ", getMaterno()=" + getMaterno() + ", getDeducciones()=" + getDeducciones() + ", getCURP()="
                    + getCURP() + ", getFechaNacimiento()=" + getFechaNacimiento() + ", getBono()=" + getBono()
                    + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                    + "]";
        }

        
    

    

}
