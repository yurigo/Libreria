package model;

public class Book {

    private int isbn;
    private String bookName;

    public Book() {
    }

    public Book(int isbn, String bookName) {
        this.isbn = isbn;
        this.bookName = bookName;
    }

    // getter setter methods

    public int getIsbn(){
        return this.isbn;
    }
}