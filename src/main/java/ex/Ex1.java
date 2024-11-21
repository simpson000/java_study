package ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력한 수는 짝수 입니다 "+ num);
        }

        else {
            System.out.println("입력한 수는 홀수 입니다 "+ num);
        }


    }
}
