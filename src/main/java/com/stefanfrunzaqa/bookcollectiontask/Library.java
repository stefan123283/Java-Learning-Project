package com.stefanfrunzaqa.bookcollectiontask;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;
    private String name;

    public Library(String name) {
        bookList = new ArrayList<>();
        this.name = name;
    }

    void addBook(Book book) {
        bookList.add(book);
        System.out.println("'" + book.getTitle() + "'" + ", by " + book.getAuthor() + " was added to the list");
    }

    void removeBookByTitle(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                System.out.println("'" + bookList.get(i).getTitle() + "'" + ", by " + bookList.get(i).getAuthor() + " was removed from the list");
                bookList.remove(bookList.get(i));
            } else {
                System.out.println("The book with the title provided did not exist in the list before");
            }
        }

    }

    void isBookAvaillable(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                System.out.println("'" + bookList.get(i).getTitle() + "'" + ", by " + bookList.get(i).getAuthor() + " exists in the list");
                System.exit(0);
            }
        }
        System.out.println("The book with the title provided did not exist in the list before");
    }

    void booksNumber() {
        System.out.println("There are " + bookList.size() + " books in the library");
    }

    void printBookDetails() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("Book " + (i+1) + ": Title: " + bookList.get(i).getTitle() + ", Author: " + bookList.get(i).getAuthor());
        }

    }
}