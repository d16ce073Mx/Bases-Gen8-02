package com.infotec;
import java.util.Scanner;


public class Main {
    private static int IVA = 16;
    public static void main(String[] args) {
            
        /* 
        Persona plutarco = new Persona();
        Domicilio Tlaxcala = new Domicilio("Juarez","34B","Heroes" );
        plutarco.setNombre("Plutarco");
        plutarco.setPaterno("Galaviz");
        plutarco.setMaterno("Carmona");
        plutarco.setDomicilio(Tlaxcala);
        
        Domicilio CDMX = new Domicilio("Interlomas","1400","Las Águilas" );
        Persona pedro = new Persona("Pedro","Carreño","Arango", CDMX);
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad = teclado.nextInt();
        boolean casado = teclado.nextBoolean();
        double salario = teclado.nextDouble();
        double ISR = salario * (IVA/100);
        System.out.println("El ISR es:"+ISR);

        if (edad >= 18) {
            System.out.println("Puedes votar "+nombre);
        }
        else {
            System.out.println("Aún nuedes votar "+nombre);

        }



    }
}