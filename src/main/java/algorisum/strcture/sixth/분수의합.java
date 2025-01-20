package algorisum.strcture.sixth;

import java.util.Scanner;

public class 분수의합 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first_top = sc.nextInt();
        int first_bottom = sc.nextInt();
        int second_top = sc.nextInt();
        int second_bottom = sc.nextInt();
        int gcd = gcd(first_bottom, second_bottom);
        int lcm = (first_bottom*second_bottom)/gcd;
        int top = first_top * (lcm / first_bottom) + second_top * (lcm / second_bottom);
        int result = gcd(Math.abs(top), lcm);
        System.out.println(top / result);
        System.out.println(lcm / result);
    }

    private static int gcd(int firstBottom, int secondBottom) {

        if (secondBottom == 0) {
            return firstBottom;
        }
        return gcd(secondBottom, firstBottom % secondBottom);
    }
}
