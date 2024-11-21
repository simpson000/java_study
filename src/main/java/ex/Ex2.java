package ex;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("음식 이름을 입력해 주세요");
        String foodName = sc.nextLine();

        System.out.println("음식 가격을 입력해 주세요");
        int foodPrice = sc.nextInt();

        System.out.println("음식 수량을 입력해 주세요");
        int foodQuantity = sc.nextInt();

        System.out.println(foodName +"를 "+ foodQuantity +"개 주문하셨습니다. 총 가격은"+ foodPrice*foodQuantity);


    }
}
