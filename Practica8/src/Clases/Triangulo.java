package Clases;

public class Triangulo extends FiguraGeometrica {
    double base;
    double altura;

    public Triangulo(double base, double altura) {

        super((base * altura)/2,
                45 );
        this.base = base;
        this.altura = altura;

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
