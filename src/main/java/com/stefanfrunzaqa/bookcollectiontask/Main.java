package com.stefanfrunzaqa.bookcollectiontask;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Library library1 = new Library("Librarius");
        Library library2 = new Library("BookStore");

        library1.addBook(new Book("Don Quixote", "Miguel de Cervantes"));
        library1.addBook(new Book("Alice's Adventures in Wonderland", "Lewis Carroll"));
        library1.addBook(new Book("The Adventures of Huckleberry Finn", "Mark Twain"));

        library2.addBook(new Book("Treasure Island", "Robert Louis Stevenson"));
        library2.addBook(new Book("Pride and Prejudice", "Jane Austen"));
        library2.addBook(new Book("Wuthering Heights", "Emily Brontë"));

        library1.booksNumber();
        library1.removeBookByTitle("The Adventures of Huckleberry Finn");
        library1.isBookAvaillable("The Adventures of Huckleberry Finn");

        Map<String, Library> librariesMap = new HashMap<>();
        librariesMap.put("Batr, bld. 44/1", library1);
        librariesMap.put("Zeli, bld. 24", library2);

        librariesMap.get("Batr, bld. 44/1").printBookDetails();
        librariesMap.get("Zeli, bld. 24").printBookDetails();

        int[] array = new int[] {20,34,47,16,39};
        IntNumberArrayService.getMinimumValue(array);
        IntNumberArrayService.getAverageValue(array);
    }
}