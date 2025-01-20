package Javamid2.collection.stack;

public class Ex2 {

    public static void main(String[] args) {

        BrowserHistyory browserHistyory = new BrowserHistyory();

        browserHistyory.visitPage("youtube.com");
        browserHistyory.visitPage("google.com");
        browserHistyory.visitPage("facebook.com");

        String currentPage1 = browserHistyory.goBack();
        System.out.println(currentPage1);

        String currentPage2 = browserHistyory.goBack();
        System.out.println(currentPage2);


    }
}
