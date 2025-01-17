package algorisum.strcture.fifth;

import java.util.Scanner;

public class 동전 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] <= target) {
                count+=(target/arr[i]);
               target %= arr[i];            }
        }
        System.out.println(count);
    }
}
