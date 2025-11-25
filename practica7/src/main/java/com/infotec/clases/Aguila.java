package com.infotec.clases;

public class Aguila extends Animal implements Volador {
    private String tipoAguila;



     @Override
     public void Volar(){
        System.out.println("Estoy volando....");
     }

    public void volarBajito(){

        System.out.println("Estoy volando bajito....");
    }
}
