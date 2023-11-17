package controller;

import dao.BookDAOMemory;
import dao.BookDaoFile;
import model.Book;
import dao.BookDAO;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    BookDAO bookDAO;

    public Controller(){
        // bookDAO = new BookDAOMemory();
        bookDAO = new BookDaoFile();
    }

    public List<Book> getBooks(){
        return bookDAO.getAllBooks();
    }
//    public boolean saveBook(Book book){
//        return true;
//    }
}
