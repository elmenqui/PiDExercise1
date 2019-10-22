package Exercise1;

import AnimalCateg.Animal;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Collection {

    private ArrayList animals = new ArrayList();
    private ArrayList<Object> swimmers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    private void display() throws Exception {

        CSVReader fileManager = new CSVReader();
        try {
            List<Animal> fields = fileManager.readCsvFile();
            System.out.println("=========================== Task Details ====================");
            fields.forEach((animal) -> {
                System.out.println("Entry #: " + (fields.indexOf(animal) + 1));
                System.out.println("Type = " + animal.getType());
                System.out.println("Animal's Name = " + animal.getName());
                System.out.println("Year of Birth = " + animal.getYear());
                System.out.println("--------------------------------------------------------------");
            });
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }

    // Sort methods
    private void sortByName() {
        System.out.println("List of animals sorted by their name:");
        animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .forEach(System.out::println);
    }

    private void sortBirthYear() {
        System.out.println("List of animals sorted by their year of birth:");
        animals.stream()
                .sorted(Comparator.comparing(Animal::getYear))
                .collect(Collectors.toCollection(ArrayList::new));
    }


    public void readSwimmers() {
        for (Object animal : animals) {
            if (animal instanceof Swimmer) {
                swimmers.add(animal);
            }
        }
    }

    public static void main(String[] args) {

        Collection main = new Collection();
        try {
            main.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}