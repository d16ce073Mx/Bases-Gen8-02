import AbiertoCerrado.*;
import Dependencia.*;
import Interfaces.Estudiante;
import Liskov.Lista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cobrar cobro = new Cobrar();
        Dinero billete20= new Billete20();
        Dinero billete50= new Billete50();
        Dinero billete100= new Billete100();

        cobro.recibirPago(billete20);
        cobro.recibirPago(billete50);
        cobro.recibirPago(billete100);
        /*
        Estudiante juanJesus = new Estudiante();
        juanJesus.estudiar();
        juanJesus.investigar();
        */


/*
        Lista lista = new Lista();
        List<Integer> arrayList = new ArrayList();
        List<Integer> linkedList = new LinkedList();

        Lista.Agregar(arrayList);
        Lista.Agregar(linkedList);
        System.out.println("Los elementos de la ARRAYLIST son:" +arrayList);
        System.out.println("Los elementos de la LINKEDLIST son:" +linkedList);

       List<Integer> pila = new Stack<>();

        Lista.Agregar(pila);
        System.out.println("Los elementos de la pila son:" +pila);


 */
/*
        CalculoAreas calculadora = new CalculoAreas();

        Figura circulo = new Circulo(5);
        Figura cuadrado = new Cuadrado(20);
        Figura hepta = new Heptagono(45,20);
        System.out.println("Area del circulo es: "+ calculadora.calcularArea(circulo));
        System.out.println("Area del cuadrado es: "+ calculadora.calcularArea(cuadrado));
        System.out.println("Area del heptagono es: "+ calculadora.calcularArea(hepta));

        //Agregar más figuras sin tener que modificar otras clases
        // No se modifica el cálculo de area

        //Pagar en efectivo
        //Pagar con debito
        //Pagar con crédito
        //Pagar con Codi
        //Pagar con transferencia

*/
    }
}