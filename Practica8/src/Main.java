import Clases.Cuadrado;
import Clases.Triangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4,5);
        System.out.println("El perimetro del triangulo es ;"+ triangulo.getPerimetro());
        System.out.println("El area del triangulo es ;"+ triangulo.getArea());
        Cuadrado cuadrado = new Cuadrado(2.5);
        System.out.println("El perimetro del cuadrado es ;"+ cuadrado.getPerimetro());
        System.out.println("El area del cuadrado es ;"+ cuadrado.getArea());

    }
}