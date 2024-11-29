package javaBasic.extend;

public class Item {
    private String name;
    private int price;
    int total;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void print() {
        System.out.println(this.name + " " + this.price);
    }
    public int getPrice() {
        total += price;
        return total;
    }
}
