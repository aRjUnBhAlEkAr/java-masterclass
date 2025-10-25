package cao;

public class Book{
    String book_name;
    double book_price;
    int book_qnty;
    String book_author;
    int book_pages;
    int total;

    public void getProperties(String book_name, double book_price, int book_qnty, String book_author, int book_pages){
        this.book_name = book_name;
        this.book_price = book_price;
        this.book_qnty = book_qnty;
        this.book_author = book_author;
        this.book_pages = book_pages;
    }

    public double calculate(){
        return book_price*book_qnty;
    }

    public void showProperties(){
        System.out.println("Book Name: " + book_name);
        System.out.println("Book Author: " + book_author);
        System.out.println("Book Price: " + book_price);
        System.out.println("Book Quantity: " + book_qnty);
        System.out.println("Book Pages: " + book_pages);
    }
};