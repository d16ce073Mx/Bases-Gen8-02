package com.infotec.entities;

import java.time.LocalDate;

public class EmpleadoAdministrativo extends Empleado {
    private int faltas;
    private int asistencias;

    

    public EmpleadoAdministrativo() {
    }



    public EmpleadoAdministrativo(String nombre, String paterno, String materno, LocalDate fechaNacimiento,
            double salarioBruto, double salarioNeto, int faltas, int asistencias) {
        super(nombre, paterno, materno, fechaNacimiento, salarioBruto, salarioNeto);
        this.faltas = faltas;
        this.asistencias = asistencias;
    }



    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }



    @Override
    public String toString() {
        return "EmpleadoAdministrativo [faltas=" + faltas + ", asistencias=" + asistencias + "]";
    }

   


}
