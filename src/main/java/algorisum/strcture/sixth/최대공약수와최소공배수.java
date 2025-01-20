package algorisum.strcture.sixth;

import java.util.Scanner;

public class 최대공약수와최소공배수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcd = gcd(n, m);
        System.out.println(gcd);
        int result = n * m / gcd;
        System.out.println(result);
    }

    private static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);

    }
}
