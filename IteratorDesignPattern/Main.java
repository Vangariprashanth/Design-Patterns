package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Book> booklist = Arrays.asList(
                new Book(100, "Science"),
                new Book(200, "Maths"),
                new Book(300, "Drawing"),
                new Book(400, "GK"));
        Library lib = new Library(booklist);
        iIterator itr = lib.createIterator();

        while (itr.hasNext()) {
            Book book = (Book) itr.next();
            System.out.println(book.getBookName());
        }
    }
}
