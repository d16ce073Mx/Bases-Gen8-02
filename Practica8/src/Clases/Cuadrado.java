package Clases;

public class Cuadrado extends FiguraGeometrica{
    double lado;



    public Cuadrado(double lado) {
        super(lado*lado, lado * 4);
        this.lado = lado;

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
