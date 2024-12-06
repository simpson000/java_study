package javamid.object;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 20);
        Rectangle rectangle1 = new Rectangle(100, 20);

        System.out.println(rectangle);
        System.out.println(rectangle1);

        System.out.println(rectangle == rectangle1);
        System.out.println(rectangle.equals(rectangle1));

    }
}
