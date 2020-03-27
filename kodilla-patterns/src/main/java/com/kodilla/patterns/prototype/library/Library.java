package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public int hashCode() {
        return books != null ? books.hashCode() : 0;
    }

    @Override
    public String toString() {
        String l = "Librarary: " + name + "\n";
        for(Book book: books) {
            l = l + book.toString() + "\n";
        }
        return l;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
        }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book theBook : books) {
            Book clonedBook = new Book(theBook.getTitle(),theBook.getAuthor(),theBook.getPublicationDate());
            clonedLibrary.books.add(clonedBook);
        }
        return clonedLibrary;
    }
}

