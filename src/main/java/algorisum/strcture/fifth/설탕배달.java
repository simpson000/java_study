package algorisum.strcture.fifth;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        while (N >= 0) {
            // 5의 배수인 경우
            if (N % 5 == 0) {
                result += N / 5;
                System.out.println(result);
                return;
            }

            // 5의 배수가 될 때까지 3kg씩 빼기
            N -= 3;
            result++;
        }

        // 정확하게 N킬로그램을 만들 수 없는 경우
        System.out.println(-1);
        sc.close();
    }
}