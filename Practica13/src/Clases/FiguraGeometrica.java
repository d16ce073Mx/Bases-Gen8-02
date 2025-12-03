package Clases;

public abstract class FiguraGeometrica implements CalculoArea{


    public abstract double getArea();
    public abstract double getPerimetro();

    public void imprimirInformacion() {
        System.out.println("Esta es una figura geométrica.");
    }


}
