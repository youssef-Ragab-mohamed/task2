package Books;

public class EBook extends Book implements Purchasable {
    private String fileType;


    public EBook(String ISBN, String title, Double price, Short year,String fileType) {
        super(ISBN, title, price, year);
        this.fileType=fileType;
        
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }


    @Override
    public Double Buy(int quantity, String email, String address) throws Exception {
         if(quantity !=1){
            throw new Exception("can't buy more than 1 copy at a time!");
         }
         System.out.println("  mail service: " + getTitle() + " to email: " + email);

        return getPrice();
        
        
    }
    
}
