package javaBasic.extend;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1",10000,"han");
        Movie movie = new Movie("영화1",10000,"han","12345");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println(sum);

    }
}
