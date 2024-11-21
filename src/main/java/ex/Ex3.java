package ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = sc.nextInt();

        int temp=0 ;
        if (num1 > num2) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        System.out.println("between " + num1 + " and " + num2 + ": ");

        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
        }


    }
}
