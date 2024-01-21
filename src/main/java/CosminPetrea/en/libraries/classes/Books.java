package CosminPetrea.en.libraries.classes;

import CosminPetrea.en.libraries.superclass.Library;

public class Books extends Library {
    private String author;
    private String genre;

    //CONSTRUCTOR

    public Books(long isbnCode, String title, int year, int pagesNumber, String author, String genre) {
        super(isbnCode, title, year, pagesNumber);
        this.author = author;
        this.genre = genre;
    }




    //GETTER AND SETTER
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return
                "-ISBN code:" + getIsbnCode() +  "\n" +
                " - title:" + getTitle() +
                " - publication year:" + getYear() +
                " - number of pages:" + getPagesNumber() + "\n" +
                " - author:" + author  +
                " - genre:" + genre  +"\n";
    }
}
