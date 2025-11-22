package com.infotec.Clases;

public class CuentaBancaria {
    private int numeroCuenta;
    private String nombre;
    private double saldo;

    public void setSaldo(double saldo){
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo debe ser mayor a 0");    
        }
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNumeroCuenta(int cuenta){
        this.numeroCuenta = cuenta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    
}
