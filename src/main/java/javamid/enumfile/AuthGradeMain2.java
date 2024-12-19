package javamid.enumfile;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        System.out.println("당신의 등급을 엽력하세요[GUEST,LOGIN,ADMIN]:");
        Scanner sc = new Scanner(System.in);
        String level = sc.nextLine();
        AuthGrade authGrade = AuthGrade.valueOf(level.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다");

    }
}
