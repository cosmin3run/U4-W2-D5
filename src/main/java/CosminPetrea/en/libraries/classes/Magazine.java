package CosminPetrea.en.libraries.classes;

import CosminPetrea.en.libraries.enums.Periodicity;
import CosminPetrea.en.libraries.superclass.Library;

public class Magazine extends Library {

    private Periodicity periodicity;

    //CONSTRUCTOR
    public Magazine(long isbnCode, String title, int year, int pagesNumber, Periodicity periodicity) {
        super(isbnCode, title, year, pagesNumber);
        this.periodicity = periodicity;
    }
    //GETTER AND SETTER


    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Periodicity periodicity) {
        this.periodicity = periodicity;
    }

    //TOSTRING


    @Override
    public String toString() {
        return  "MAGAZINES" + "\n" +
                "- periodicity=" + periodicity +
                "- ISBN code:'" + getIsbnCode() + '\'' + "\n" +
                "- title:'" + getTitle() + '\'' +
                "- publication year:'" + getYear() + '\'' +
                "- number of pages:'" + getPagesNumber() + '\'' +"\n";
    }
}
