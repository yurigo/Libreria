package dao;

import model.Book;

import java.util.List;

public class BookDAOMysql implements BookDAO{
    @Override
    public List<Book> getAllBooks() {
        return null;
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
