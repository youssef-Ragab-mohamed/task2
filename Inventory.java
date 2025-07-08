import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Books.Book;
import Books.Purchasable;

public class Inventory {

    private List<Book> booksList;

    

  
    public Inventory() {
        this.booksList = new ArrayList<>();
    }
    


    public List<Book> getBooksList() {
        return this.booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    public void addBook(Book book){
        booksList.add(book);
        System.out.println("  Added book " + book.getTitle());
 
    }
    public void removeOldBooks( int maxYearsOld){
       booksList.removeIf(book ->LocalDate.now().getYear() - book.getYear() > maxYearsOld);

      
    }
 
    public Double buyBook(String isbn, int quantity, String email, String address) throws Exception {
    Book bookToPay = null;

    for (Book book : booksList) {
        if (book.getISBN().equals(isbn)) {
            if (!(book instanceof Purchasable)) {
                throw new Exception(" This book isn't for sale!");
            }
            bookToPay = book;
            break; 
        }
    }

    if (bookToPay == null) {
        throw new Exception("  Book with ISBN :" + isbn + "is not found.");
    }

    return ((Purchasable) bookToPay).Buy(quantity, email, address);
}


    }
