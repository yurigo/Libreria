package dao;

import model.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDaoFile implements BookDAO {
    ArrayList<Book> bookList;

    public BookDaoFile(){

        bookList = new ArrayList<Book>();

        try {
            File myObj = new File("./src/books.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                int isbn = Integer.parseInt(data.split(",")[0]);
                String bookName = data.split(",")[1];

                Book b = new Book(isbn , bookName);

                bookList.add(b);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    @Override
    public List<Book> getAllBooks() {


        return bookList;
    }

    @Override
    public Book getBookByIsbn(int isbn) {
        return null;
    }

    @Override
    public void saveBook(Book book) {

    }

    @Override
    public void deleteBook(Book book) {

    }
}
