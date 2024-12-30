package javamid.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NetworkServiceVO vo = new NetworkServiceVO();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println("전송할 문자:");
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
            vo.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다");
    }
}
