import clases.Empleado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado roberto = new Empleado("Roberto", 25,"ROBER123");
        roberto.imprimir();
        roberto.info();
    }
}