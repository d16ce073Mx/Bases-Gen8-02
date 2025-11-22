package com.infotec;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente casas = new Cliente("CASAS123", "Jose Luis Casas","JCasas@infotec.com");
        Categoria semilla = new Categoria("Abarrotes","Semillas y Abarrotes");
        Productos nueces = new Productos ("Nuez pecana", semilla,10, 300 );
        Productos almendras = new Productos ("Almendra", semilla,10, 180 );
        List <Productos> productos = new ArrayList<>();
        productos.add(nueces);
        productos.add(almendras);

        Ventas ticket = new Ventas(1, casas, productos);



    }
}