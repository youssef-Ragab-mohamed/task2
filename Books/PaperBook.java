package Books;

public class PaperBook extends Book implements Purchasable {
    private int quantity;

    public PaperBook(String ISBN, String title, Double price, Short year,int quantity) {
        super(ISBN, title, price, year);
        this.quantity=quantity;

        
    }


    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public Double Buy(int quantity, String email, String address) throws Exception {
        if (this.quantity<quantity) {
            throw new Exception("not enough qunatity in stock!");
            
        }
        this.quantity-=quantity;
          System.out.println("  Sshipping service  : quantity: " + quantity +" - " + getTitle() + " to address " + address);
          return getPrice()*quantity;

        
    }

   


    
}
