package algorisum.strcture.secondweek;

import java.util.Scanner;
import java.util.*;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int total = 0;
        int wait = 0;

        for (int i = 0; i < n; i++) {
            wait += arr[i];
            total += wait;
        }

        System.out.println(total);
    }
}
