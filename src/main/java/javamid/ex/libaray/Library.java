package javamid.ex.libaray;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount] = new Book(title, author);
            bookCount++;

        }
        else {
            System.out.println(" 도서관 저장 공간이 부족합니다");

        }



    }

    public void showBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println("title: " + books[i].title+", author: " + books[i].author);
        }
    }


    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
