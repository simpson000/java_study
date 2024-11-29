package javaBasic;

public class Car {
    private String name;
    private Car [] car = new Car[3];
    static int count ;

    public Car(String name) {
        System.out.println(name);
        this.name = name;
        count++;
    }
    public static void showTotalCars(){
        System.out.println(count);

    }
}
