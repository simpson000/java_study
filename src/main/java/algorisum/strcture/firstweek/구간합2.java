package algorisum.strcture.firstweek;

import java.util.Scanner;

public class 구간합2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int quiz = sc.nextInt();
        int[][] arr = new int[size+1][size+1];
        // 2차원 배열 입력받기
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 2차원 누적 합 계산
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                arr[i][j] += arr[i][j-1] + arr[i-1][j] - arr[i-1][j-1];
            }
        }

        // 구간 합 계산
        for (int i = 0; i < quiz; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int sum = arr[x2][y2] - arr[x2][y1-1] - arr[x1-1][y2] + arr[x1-1][y1-1];
            System.out.println(sum);
        }

    }
}
