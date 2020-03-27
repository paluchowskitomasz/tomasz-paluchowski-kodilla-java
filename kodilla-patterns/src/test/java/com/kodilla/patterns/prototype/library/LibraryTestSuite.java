package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {


    @Test
    public void getBook() {

        //given
        Library firstLibrary = new Library("First library");
        Book book1 = new Book("Book nr 1","Author nr 1",
                LocalDate.of(1980,01,12));
        Book book2 = new Book("Book nr 2","Author nr 1",
                LocalDate.of(1981,02,12));
        Book book3 = new Book("Book nr 3","Author nr 1",
                LocalDate.of(1982,03,12));
        Book book4 = new Book("Book nr 4","Author nr 1",
                LocalDate.of(1983,04,12));
        Book book5 = new Book("Book nr 5","Author nr 1",
                LocalDate.of(1984,05,12));

        firstLibrary.getBooks().add(book1);
        firstLibrary.getBooks().add(book2);
        firstLibrary.getBooks().add(book3);
        firstLibrary.getBooks().add(book4);
        firstLibrary.getBooks().add(book5);

        Library clonedLibrary = null;
        try {
            clonedLibrary = firstLibrary.shallowCopy();
            clonedLibrary.setName("Cloned library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = firstLibrary.deepCopy();
            deepClonedLibrary.setName("Deep cloned library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        firstLibrary.getBooks().remove(book1);

        //Then
        System.out.println(firstLibrary.toString());
        System.out.println(clonedLibrary.toString());
        System.out.println(deepClonedLibrary.toString());
        Assert.assertEquals(4,firstLibrary.getBooks().size());
        Assert.assertEquals(4,clonedLibrary.getBooks().size());
        Assert.assertEquals(5,deepClonedLibrary.getBooks().size());

    }

}
