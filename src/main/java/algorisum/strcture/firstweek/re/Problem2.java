package algorisum.strcture.firstweek.re;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 점수 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 최댓값 찾기
        int max = arr[0];
        for (int score : arr) {
            if (score > max) {
                max = score;
            }
        }

        // 새로운 평균 계산
        double total = 0;
        for (int score : arr) {
            total += calculate(score, max);
        }

        System.out.println(total / n);
    }

    public static double calculate(int score, int max) {
        return (score * 100.0) / max;  // double로 계산하도록 수정
    }
}