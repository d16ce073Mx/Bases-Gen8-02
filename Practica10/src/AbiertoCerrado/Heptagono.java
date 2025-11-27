package AbiertoCerrado;

public class Heptagono implements Figura{
    private double apotema;
    private double lado;

    public Heptagono(double apotema, double lado) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (this.lado*7) * this.apotema;
    }
}
