

public class Operadores {

    public static void main(String[] args) throws Exception {

        Cafetera cafeterita = new Cafetera();
        cafeterita.setCafe(10);
        cafeterita.setPorcentajeAgua(50);
        cafeterita.setCapacidad(12);

        Cafetera cafeteritaOster = new Cafetera(80,20,20);
        System.out.println("El porcentaje de agua de CafeteritaOster es:"+cafeteritaOster.getPorcentajeAgua());

        int a = 15;
        double b = 14;
        char car = 'b';
        String nombre= "Plutarco";
        System.out.printf("El Valor de b es: %d",a);
        System.out.println(b);
     //   System.out.print(car);

    if (!(a == b) || nombre != "Plutarco"){
        System.out.println("** a y b son iguales" );
    } 
    else {
        System.out.println("** a y b son diferentes" );
    }
    //Operador ternario
    String mensaje = (a == b) ? "es mayor a que b" : "b es mayor a que a";
    System.out.print(mensaje);

    for (int i=0; i<=5; i++){
        System.out.println("El valor de i es;"+i);

    }

    int contador = 0;
    while (contador < 3) {
        System.out.println("El valor del contador es: "+contador);
        contador++;
    }

    int iterador = 0;    
    do { 
        System.out.println("El valor del iterador es:"+iterador);
        ++iterador;
    } while (iterador < 5);
  //Operadores Comparativos
//  < Mayor que
//    > Menor que 
//    ==. Igual , 
//    <= Mayor IIgual , 
//    >= Menor igual , 
//    != Diferente

/*
        Operadores Lógicos
AND, OR, NOT

Dinsyuyncion  ||    OR
Conjuncion    &&    AND 
Negacion      !     NOT
 */


    }
}
