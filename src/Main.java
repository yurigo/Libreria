import controller.Controller;
import model.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
System.out.println("before controller");
        Controller c = new Controller();
System.out.println("after controller");

System.out.println("before getBooks");
        List<Book> books = c.getBooks();
System.out.println("after getBooks");

        for (Book book : books) {
        System.out.println("Book ISBN : " + book.getIsbn());
        }

        List<Book> books2 = c.getBooks();

        for (Book book : books2) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }

        List<Book> books3 = c.getBooks();

        for (Book book : books3) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }

        List<Book> books4 = c.getBooks();

        for (Book book : books4) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }

    }
}