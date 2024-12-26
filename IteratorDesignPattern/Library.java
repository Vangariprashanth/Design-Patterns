package IteratorDesignPattern;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public iIterator createIterator() {
        return new BookIterator(books);
    }
}
