package javaBasic.shopping;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count ;


    public void addItem(Item item) {
        if(count>items.length){
            System.out.println("초과");
            return;
        }
        items[count] = item;
        count+=1;
    }

    public void displayItems() {
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.println(item.getName() + " " + item.getPrice());
        }
        System.out.println("전체: "+ calculateTotal());
    }

    private int calculateTotal() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getPrice();
        }
        return total;
    }
}
