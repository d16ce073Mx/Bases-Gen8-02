package com.infotec;

import com.infotec.clases.Aguila;
import com.infotec.clases.Pinguino;

public class Main {
    
    public static void main(String[] args) {
        Aguila aguila = new Aguila();
        aguila.Volar();
        aguila.volarBajito();

        Pinguino marinela = new Pinguino();
        Pinguino bimbo = new Pinguino(2);
        Pinguino polar = new Pinguino(2, "Pinguinito");



    }
}