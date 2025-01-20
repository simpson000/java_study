package algorisum.strcture.sixth;

import java.util.Scanner;

public class 최소공배수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int result = (first*second)/gcd(first, second);
            System.out.println(result);
        }
    }

    private static int gcd(int first, int second) {
        if (second == 0) {
            return first;
        }
        else {
            return gcd(second, first % second);
        }
    }
}
