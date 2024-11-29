package javaBasic.extend;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name,int price,String author,String isbn) {
        super(name,price);
        this.author = author;
        this.isbn = isbn;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
