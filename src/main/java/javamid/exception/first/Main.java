package javamid.exception.first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        NetworkServiceV1_1 v1 = new NetworkServiceV1_1();
        NetworkServiceV1_3 v = new NetworkServiceV1_3();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자:");
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
            v.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다");
    }
}
