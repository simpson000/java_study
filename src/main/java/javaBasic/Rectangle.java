package javaBasic;

public class Rectangle {
    int length;
    int width;
    void area(){
        System.out.println("Area of Rectangle:"+length*width);
    }
    void perimeter(){
        System.out.println("Perimeter of Rectangle:"+(length*2+width*2));
    }
    void isSquare(){
        if (length*width == length*2){
            System.out.println("Square is a square");
        }
        else System.out.println("not a square");
    }
}
