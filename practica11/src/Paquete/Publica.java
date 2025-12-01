package Paquete;

public class Publica {
    public String nombre;
    public int edad;

    public Publica() {
    }

    public Publica(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        /*
        // Ejemplo de metodo protegido
        Protegida protegida = new Protegida();
        protegida.edad = 20;
         */
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
}
