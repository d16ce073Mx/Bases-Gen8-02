import Clases.Triangulo;
import java.util.List;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(30,20,25);
        Triangulo triangulo2 = new Triangulo(12);
        Triangulo triangulo3 = new Triangulo(20,10,15);

        List<Triangulo> listaTriangulos = new ArrayList<>();

        listaTriangulos.add(triangulo1);
        listaTriangulos.add(triangulo2);
        listaTriangulos.add(triangulo3);

        //iterar sobre la lista de triangulos
        for(Triangulo triangulo: listaTriangulos){
            System.out.println("Area del triangulo:" +triangulo.calcularArea());
            System.out.println("Perimetro del triangulo:" +triangulo.calcularPerimetro());
        }


    }
}