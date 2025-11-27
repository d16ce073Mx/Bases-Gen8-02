package Liskov;
import java.util.List;

public class Lista {
    public static void Agregar(List<Integer> lista){
        lista.add(10);
        lista.add(20);
        System.out.println("Lista actual: "+lista);
    }
}
