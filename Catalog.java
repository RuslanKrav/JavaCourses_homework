package com.company.lection8.homework;
import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<Book> books = new ArrayList<Book>(){{
        for (int i = 0; i <5 ; i++) {
            add(new Book("Book" + i, "ABC" + i));
        }
        for (int i = 2; i <11 ; i++) {
            add(new Book("Book" + i, "DEF" + i));
        }
        for (int i = 6; i <17 ; i++) {
            add(new Book("Book" + i, "GHI" + i));
        }
    }};

    public static class Book{
        String bookName;
        String id;
        boolean checkTake;
        StringBuilder history;

        public Book(String bookName, String id) {
            this.bookName = bookName;
            this.id = id;
            checkTake = false;
            history = new StringBuilder();
        }
    }

    @Override
    public String toString() {
        StringBuilder catalogLog = new StringBuilder();
        for (Book book : books){
            catalogLog.append(book.bookName);
            catalogLog.append("\r\n");
            catalogLog.append(book.history);
        }

        return catalogLog.toString();
    }
}
