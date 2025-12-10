import java.io.File;
import java.io.FileReader;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //Practica de lectura de archivos CSV
            //Libreria OPENCSV
            // Apache Commons
        File directory = new File("/.");
        System.out.println("Directorio: "+directory.getAbsolutePath());

        try {
            FileReader fileReader = new FileReader("G02.csv");
            CSVParser parser = (new CSVParserBuilder()).withSeparator(',').build();
            CSVReader csvReader = (new CSVReaderBuilder(fileReader)).withCSVParser(parser).build();

            String [] linea;
                while  ((linea = csvReader.readNext())!=null){
                    for (String dato: linea)
                        System.out.println(dato);
                    //PHP y Python
                    // Stream Flows
                    // ETL -> Extracción, Transformación y Carga  (L- Load)
                    // Snowflake, PowerBuilder, Oracle ODI
                    //Datawarehouse-> Métodos estadísticos
                }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}