import clases.Empleado;
import clases.EmpleadoDeConfianza;
import clases.EmpleadoDeContrato;
import clases.EmpleadoEventual;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Empleado roberto = new Empleado("Roberto", 25,"ROBER123");
        roberto.imprimir();
        roberto.info();*/

        EmpleadoDeConfianza alvaro = new EmpleadoDeConfianza("Alvaro"
                , 30,"Director","Gobierno","Sistemas",80000);

        EmpleadoDeContrato claudia = new EmpleadoDeContrato("Claudia", 25, LocalDate.of(2010,11,01), 50000);
        EmpleadoEventual julio = new EmpleadoEventual("Julio", 28,LocalDate.of(2005,1,1), 200000);

        System.out.println(alvaro.calcularSueldo());
        System.out.println(claudia.calcularSueldo());
        System.out.println(julio.calcularSueldo());
    }
}