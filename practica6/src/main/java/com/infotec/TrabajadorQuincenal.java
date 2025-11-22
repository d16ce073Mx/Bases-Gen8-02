package com.infotec;
import java.time.LocalDate;
import com.infotec.Trabajador;

public class TrabajadorQuincenal extends Trabajador {
    private int quincena;

    public int getQuincena() {
        return quincena;
    }

    public void setQuincena(int quincena) {
        this.quincena = quincena;
    }

    public TrabajadorQuincenal(int quincena) {
        this.quincena = quincena;
    }    
        public TrabajadorQuincenal() {
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
        public String getRFC() {
            return super.getRFC();
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

        @Override
        public void setRFC(String rFC) {
            super.setRFC(rFC);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public String toString() {
            return super.toString();
        }

    

}