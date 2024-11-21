package ex;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("1: 상품 입력 2: 결제 3: 프로그램 종료");
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("상품명을 입력하세요");
                    String name = input.next();
                    System.out.println("상품 가격을 입력하세요");
                    int cost = input.nextInt();
                    System.out.println(" 상품 수량을 입력하세요");
                    int quantity = input.nextInt();
                    total += cost * quantity;
                    System.out.println("상품명 :"+name +"가격: " + cost +"수량: " +"합계:"+ cost * quantity );
                    break;

                case 2:
                    System.out.println("총 비용: "+total);
                    System.out.println("결제 완료");
                    total = 0;
                    break;

                case 3:
                    System.out.println("종료");
                    return;

                default:
                    System.out.println("올바른 값을 입력해 주세요");
                    break;
            }
        }
    }
}
