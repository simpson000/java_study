package ex;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        run();

    }
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int total =0;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("-------------------------");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요");
                    int price = sc.nextInt();
                    total += price;
                    System.out.println(price + "원을 입금하였습니다. 현재 잔액 :" + total);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요");
                    price= sc.nextInt();
                    if (total<price){
                        System.out.println("잔액 부족");
                        break;
                    }
                    total -= price;
                    System.out.println(price + "원을 출금하였습니다. 현재 잔액 :" + total);
                    break;
                case 3:
                    System.out.println("현재 잔액은 :" +total);
                    break;

                case 4:
                    return;
            }
        }
    }
}
