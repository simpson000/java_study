package javaBasic;

public class Book {
    String title;
    String author;
    int pages;

    Book(){
        System.out.println("Book Constructor");
    }

    Book(String title, String author) {
        this(title, author, 1);
        this.title = title;
        this.author = author;
        this.pages = 1;

    }
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;

    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
