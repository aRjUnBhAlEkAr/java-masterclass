package cao;

import java.util.Scanner;

public class BookDemo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Creating a object of Book class.
        Book book = new Book();

        System.out.print("Enter book name: ");
        String book_name = in.nextLine();
        
        System.out.print("Enter book author: ");
        String book_author = in.nextLine();

        System.out.print("Enter book price: ");
        double book_price = in.nextDouble();

        System.out.print("Enter book quantity: ");
        int book_qnty = in.nextInt();

        System.out.print("Enter book pages: ");
        int book_pages = in.nextInt();

        book.getProperties(book_name, book_price, book_qnty, book_author, book_pages);
    
        System.out.println("Price of all books is: " + book.calculate());

        book.showProperties();
    }
};