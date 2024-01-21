package CosminPetrea.en.libraries.superclass;

public abstract class Library {

    private Long isbnCode;
    private String title;
    private int year;
    private int pagesNumber;

    //Constructor

    public Library(Long isbnCode, String title, int year, int pagesNumber) {
        this.isbnCode = isbnCode;
        this.title = title;
        this.year = year;
        this.pagesNumber = pagesNumber;
    }



    //GETTER E SETTER
    public Long getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(Long isbnCode) {
        this.isbnCode = isbnCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return "Library{" +
                "- ISBN code:'" + isbnCode + '\'' +
                "- title:'" + title + '\'' +
                "- publication year:" + year +
                "- number of pages=" + pagesNumber +
                '}';
    }
}
