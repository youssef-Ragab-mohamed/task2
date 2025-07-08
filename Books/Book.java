package Books;

public abstract class Book {
   private String ISBN ;
    private String title;
    private Double price;
    private Short year;

    public Book(String ISBN, String title, Double price, Short year) {
        this.ISBN = ISBN;
        this.title = title;
        this.price = price;
        this.year = year;
    }


    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Short getYear() {
        return this.year;
    }

    public void setYear(Short year) {
        this.year = year;
    }
    

    
}
