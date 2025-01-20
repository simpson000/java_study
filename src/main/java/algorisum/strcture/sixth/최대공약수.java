package algorisum.strcture.sixth;

import java.util.Scanner;

public class 최대공약수 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long result = gcd(n, m);
        while (result > 0) {
            System.out.print("1");
            result--;
        }
    }

    private static long gcd(long n, long m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }
}
