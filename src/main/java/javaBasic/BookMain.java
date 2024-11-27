package javaBasic;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.displayInfo();

        Book book2 = new Book("Hello Java","Seo");
        book2.displayInfo();
        Book book3 = new Book("Java","Seo",10);
        book3.displayInfo();

    }
}
