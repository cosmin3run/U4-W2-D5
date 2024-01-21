package CosminPetrea;

import CosminPetrea.en.libraries.classes.Archive;
import CosminPetrea.en.libraries.classes.Books;
import CosminPetrea.en.libraries.classes.GenerateItem;
import CosminPetrea.en.libraries.superclass.Library;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {


        System.out.println("Library Execise");

        //Creating a list to generate a catalogue

        List<Library> catalogue1 = new ArrayList<>();

        //Generating as many books and magazines as we prefer through generate class

        System.out.println("\n" + "---------- GENERATE A CATALOGUE WITH DIFFERENT NUMBER OF BOOKS AND MAGAZINES ------------" + "\n");
        GenerateItem.generateItem(5,4,catalogue1);
        //System.out.println(catalogue1.toString());


        Books silmarillion = new Books(1556452322, "Il Silmarillion", 2013, 682,"J.R.R. Tolkien", "Fantasy");
        Books unonessunocentomila = new Books(1556452125, "Uno, nessuno e centomila", 1926, 190,"Luigi Pirandello", "Romanzo");

        System.out.println("\n"+"----------- ADDING NEW ELEMENTS TO THE CATALOGUE ------------" + "\n");
        catalogue1.add(silmarillion);
        catalogue1.add(unonessunocentomila);
        catalogue1.forEach(System.out::println);

        //DELETE USING ISBM
        System.out.println("\n"+"----------- DELETING AN ELEMENT USING ISBN CODE ------------" + "\n");

        long toDeleteIsbn = 1556452322;

        catalogue1.removeIf(e -> e.getIsbnCode() == toDeleteIsbn );
        catalogue1.forEach(System.out::println);

        //SEARCH BY ISBN
        System.out.println("\n"+"----------- SEARCHING AN ELEMENT USING ISBN CODE ------------" + "\n");
        long toSearchIsbn = 1556452125;
        catalogue1.stream().filter(e -> e.getYear() == toSearchIsbn);
        catalogue1.forEach(System.out::println);


        //SEARCH BY ISBN
        String toSearchAuth = "Luigi Pirandello";

        List<Library> searchByAuth = catalogue1.stream().filter(e -> e instanceof Book) && ((Books) e).getAuthor().equals(toSearchAuth);
    }
}
