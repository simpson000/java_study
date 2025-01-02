package javamid.exception.second;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NetworkClientExceptionV2{
        NetworkServiceV2_1 v = new NetworkServiceV2_1();

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
