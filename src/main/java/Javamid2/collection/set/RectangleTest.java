package Javamid2.collection.set;

import java.util.HashSet;
import java.util.Set;

public class RectangleTest {

    public static void main(String[] args) {

        Set<Rectangle> rec = new HashSet<>();
        rec.add(new Rectangle(10, 10));
        rec.add(new Rectangle(5, 5));
        rec.add(new Rectangle(10, 10));

        for (Rectangle r : rec) {
            System.out.println("ractangle = " + r);
        }
    }
}
