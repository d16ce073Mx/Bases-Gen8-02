import Paquete.Default;
import Paquete.Privada;
import Paquete.Protegida;
import Paquete.Publica;
//import Paquete.Default;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Práctica a nivel de atributos

        //  No permite la instanciacion fuera del paquete

        //Clase protegida ejemplo con la clase publica nivel de paquete
        Protegida protegida = new Protegida();

        Privada privada = new Privada();
        privada.setEdad(15);
        System.out.println("La edad es:"+ privada.getEdad());


        Publica publica = new Publica();
        publica.edad = -35;
        publica.nombre = "José";
        System.out.println("La clase pública es:"+publica.getNombre() + "  Edad:"+publica.getEdad());
        System.out.println("La clase pública es:"+publica.nombre + "  Edad:"+publica.edad);




        /*
        practica a nivel de clases
        //  No permite el acceso a nivel de clase
            Privada privada = new Privada();
        //  No permite el acceso a nivel de clase
        //Protegida protegida = new Protegida();
        //  No permite el acceso a nivel de clase
        // Default default = new Default();
        Publica publica = new Publica();
        */
    }
}