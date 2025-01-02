package javamid.exception.third;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NetworkServiceV4 v = new NetworkServiceV4();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자:");
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
            try {
                v.sendMessage(input);
            }
            catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지: 죄송합니다 알 수 없는 ");
        e.printStackTrace();

    }
}
