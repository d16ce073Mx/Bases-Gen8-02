package Paquete;
import Paquete.Protegida;
public class Privada {
    private String nombre;
    private int edad;


    public Privada() {
        Interna interna = new Interna("uno","dos");
        interna.setDos("dos");
        interna.setUno("uno");




    }

    public Privada(String nombre, int edad) {
        this.nombre = nombre;
        if (edad >= 18 ) {
            this.edad = edad;
        }
        else {
            System.out.println("No es posible dar de alta");
        }
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
        if (edad >= 18 ) {
            this.edad = edad;
        }
        else {
            System.out.println("No es posible dar de alta");
        }
    }

    private class Interna{
        public String uno;
        public String dos;

        public Interna(String uno, String dos) {
            this.uno = uno;
            this.dos = dos;
        }

        public String getUno() {
            return uno;
        }

        public void setUno(String uno) {
            this.uno = uno;
        }

        public String getDos() {
            return dos;
        }

        public void setDos(String dos) {
            this.dos = dos;
        }
    }
}
