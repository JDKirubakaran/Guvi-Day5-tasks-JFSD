package com.guvi.day5.oops1.book;

public interface ManagementSystem {

    void addBook(Book newBook);
    void removeBook(int bookId);
    Book searchBooks(String keyword);
    void displayBooks();
    void issueBook(int bookId);
    void returnBook(int bookId);
}
