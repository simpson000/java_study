package javaBasic;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        run();
    }


    static void run (){
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int count =sc.nextInt();
        ProductOrder [] productOrder = new ProductOrder[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i+1)+"번쨰 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.next();
            System.out.print("가격: ");
            int productPrice = sc.nextInt();
            System.out.println("수량:");
            int productQuantity = sc.nextInt();
            productOrder [i] = createOrder(productName, productPrice, productQuantity);
        }
        for (ProductOrder order : productOrder) {
            System.out.println("상품명: "+ order.productName+"가격:"+order.productPrice+"수량:"+order.productQuantity);
        }
        int totalAmount = getTotalAmount(productOrder);
        System.out.println(totalAmount);
    }


    static int getTotalAmount(ProductOrder[] productOrder) {

        int totalAmount = 0;
        for (ProductOrder p : productOrder) {
            totalAmount += p.productQuantity*p.productPrice;
        }
        return totalAmount;
    }

    static ProductOrder createOrder (String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.productPrice = price;
        order.productQuantity = quantity;

        return order;
    }
}
