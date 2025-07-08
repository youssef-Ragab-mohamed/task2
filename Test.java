import Books.*;
 
import Books.PaperBook;

public class  Test {

    public static void main(String[] args) {
        try {
 
            Inventory inventory = new Inventory();

            
            inventory.addBook(new PaperBook("P001", "fast trains ",  150.0, (short) 2015, 10));
            inventory.addBook(new EBook("E001", "Learn java basics",  100.0, (short) 2020, "PDF"));
            inventory.addBook(new DemoBook("S001", "Demo Book",  0.0, (short) 2010));

            System.out.println("************************");

        
            double PayAmount = inventory.buyBook("P001", 2, "user@example.com", "  Cairo St...");
            System.out.println("Quantum book store: Paid " + PayAmount + " for PaperBook");

            System.out.println("**********************");

          
            double ebookAmount = inventory.buyBook("E001", 1, "mail@example.com", "alex st....");
            System.out.println("Quantum book store: Paid " + ebookAmount + " for EBook");

            System.out.println();

             
            inventory.removeOldBooks(5);

        } catch (Exception e) {
            System.out.println("  ERROR  " + e.getMessage());
        }
    }
}
