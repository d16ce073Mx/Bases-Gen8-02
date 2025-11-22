package com.infotec;
import com.infotec.Clases.CuentaBancaria;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNumeroCuenta(1738428276);
        cuenta.setNombre("Jose Antonio Ramos");
        //cuenta.saldo = -100;
        cuenta.setSaldo(-120);

        System.out.println("El saldo es: " +cuenta.getSaldo());
        
    }
}