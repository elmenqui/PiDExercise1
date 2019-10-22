package Exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Simple CSV reader that reads the original "animal.csv" file and places the field into a list
 */


class CSVReader {

    /**
     * @return a List with the content of the CSV by Line
     * @throws Exception when filepath is not correct
     */
    List<Animal> readCsvFile() throws Exception {

        List<Animal> fields = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/animals.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] lineContents = line.split(",");
            Animal animal = new Animal();
            try {
                animal.setType(lineContents[0]);
                animal.setName(lineContents[1]);
                animal.setYear(lineContents[2]);
            } catch (NumberFormatException e) {
                System.out.println("The array doesn't have four items!");
            }
            fields.add(animal);
        }
        return fields;
    }

}


