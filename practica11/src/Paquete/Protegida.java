package Paquete;

public class Protegida {
    protected String nombre;
    protected int edad;

    public Protegida() {
    }

    public Protegida(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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


    protected class  ProtegidaInterna {
        String uno;
        String dos;

        public ProtegidaInterna(String uno, String dos) {
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
