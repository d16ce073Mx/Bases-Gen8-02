import java.io.File;
import java.io.FileReader;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


import java.io.IOException;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());

        try {

           FileReader filereader = new FileReader("grupo02.csv");

            CSVParser parser = new CSVParserBuilder().withSeparator(',').build();

            CSVReader csvReader = new CSVReaderBuilder(filereader).withCSVParser(parser).build();
            String[] nextRecord;

            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}