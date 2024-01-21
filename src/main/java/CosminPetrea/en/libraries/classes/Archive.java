package CosminPetrea.en.libraries.classes;

import CosminPetrea.en.libraries.enums.Periodicity;
import CosminPetrea.en.libraries.superclass.Library;
import com.github.javafaker.Faker;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Archive {
    private List<Library> bookArchive;
    private List<Library> magazineArchive;

    //Constructor
    public Archive() {
        this.bookArchive = bookArchive = new ArrayList<>();
        this.magazineArchive = magazineArchive = new ArrayList<>();
    }


    //Remove book by ESBN

    public void deleteByIsbn(String isbnCode) {
        bookArchive.removeIf(e -> e.getIsbnCode().equals(isbnCode));
    }

    //Search by ISBN

    public Optional<Library> searchByIsbn(String isbn) {
        return bookArchive.stream().filter(e -> e.getIsbnCode().equals(isbn)).findFirst();
    }

    //Search by YEAR
    public List<Library> searchByYear(int year) {
        return bookArchive.stream().filter(e -> e.getYear() == year).collect(Collectors.toList());
    }
    //Search by AUTHOR

    public List<Library> searchByAuthor(String auth) {
        return bookArchive.stream().filter(e -> e instanceof Books && ((Books) e).getAuthor().equals(auth)).toList();
    }


    //Getter and Setter


    public List<Library> getBookArchive() {
        return bookArchive;
    }

    public void setBookArchive(List<Library> bookArchive) {
        this.bookArchive = bookArchive;
    }

    public List<Library> getMagazineArchive() {
        return magazineArchive;
    }

    public void setMagazineArchive(List<Library> magazineArchive) {
        this.magazineArchive = magazineArchive;
    }

    @Override
    public String toString() {
        return "Archive:" + "\n" +
                "Books:" + "\n" + bookArchive + "\n" +
                "Magazines:" + magazineArchive;
    }
}
