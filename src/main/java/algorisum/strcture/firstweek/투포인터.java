package algorisum.strcture.firstweek;

import java.util.Scanner;

public class 투포인터 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1, count = 1, start_idx = 1, end_idx = 1;
        while (end_idx < n) {
            if (sum == n){
                count++;
                end_idx++;
                sum = sum + end_idx;
            } else if (sum>n) {
                sum-=start_idx;
                start_idx++;
            } else  {
                end_idx++;
                sum+=end_idx;
            }

        }
        System.out.println(count);
    }
}
