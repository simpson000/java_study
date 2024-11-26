package javaBasic;

public class Ex1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "movie";
        inception.review ="5";

        MovieReview abouttime = new MovieReview();
        abouttime.title = "movieeee";
        abouttime.review ="5eee";

        MovieReview [] movies = {inception,abouttime};
        for(MovieReview movieReview : movies){
            System.out.println("Title: " + movieReview.title+ " Review: " + movieReview.review);
        }
    }
}
