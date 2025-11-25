package com.infotec.clases;

public class Pinguino extends Animal {
    private int patas;


    public Pinguino() {
    }


    public Pinguino(int patas) {
        this.patas = patas;
    }

    public Pinguino(int patas, String nombre) {
        super(nombre);
        this.patas = patas;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
