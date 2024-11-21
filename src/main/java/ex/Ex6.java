package ex;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 10;
        int productCount =0;
        String [] prductNames = new String [max];
        int [] prductNums = new int [max];
        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.println("메뉴를 선택하세요: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                if (productCount >= max) {
                    System.out.println("초과함");
                    continue;
                }
                System.out.println("상품 이름을 입력해 주세요");
                prductNames[productCount] = sc.nextLine();

                System.out.println("상품 가격을 입력하세요");
                prductNums[productCount] = sc.nextInt();
                productCount++;
            }
            else if (choice == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(prductNames[i]+prductNums[i]);
                }

            }
            else if (choice == 3) {
                System.out.println("종료합니다");
                break;
            }
            else {
                System.out.println("잘못된 메뉴를 선택하셨습니다");
                break;
            }
        }
    }
}
