import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import Clases.Estudiante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());
        String linea;
        Estudiante estudiante = new Estudiante();
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        //String [] datos;
        try {
                FileReader file = new FileReader("grupo02.txt");
                BufferedReader br = new BufferedReader(file);
                linea = br.readLine();
                String [] datos = linea.split(",");
                while ((linea!=null)){
                    datos = linea.split(",");
                    System.out.println(Arrays.toString(datos));

                    estudiante.setNombre(datos[0]);
                    estudiante.setEdad(Integer.parseInt(datos[1]));
                    estudiante.setColegio(datos[2]);
                    estudiante.setStatus(datos[3]);
                    estudiante.setPromedio(Double.parseDouble(datos[4]));
                    // Lista de objetos de tipo estudiante
                    estudiantes.add(estudiante);
                    System.out.println(estudiante);

                    linea = br.readLine();

                }
        } catch (IOException e) {
            System.out.println("La excepción es:"+e);
        }
        finally {
            System.out.println("Terminamos la operación de lectura de archivos");
        }

        for (Estudiante student: estudiantes)
            System.out.println(student.toString());

    }
}