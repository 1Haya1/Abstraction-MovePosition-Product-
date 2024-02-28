public class Book extends Product {


    private String author;


    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    @Override
    public double getDiscount() { // Return discount for book
   return getPrice()*0.05;
    }



}
