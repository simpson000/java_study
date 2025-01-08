package algorisum.strcture.secondweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001];  // 입력되는 수는 10,000보다 작거나 같은 자연수

        // 입력받으면서 바로 카운팅
        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        // 카운팅된 값들을 순차적으로 출력
        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                sb.append(i).append('\n');
                count[i]--;
            }
        }

        System.out.print(sb);
    }

    private static void Radix_Sort(int[] arr, int max_length) {
        int[] output = new int[arr.length];
        int jarisu = 1;

        while (jarisu <= max_length) {
            int[] bucket = new int[10];

            for (int i = 0; i < arr.length; i++) {
                bucket[(arr[i] / jarisu) % 10]++;
            }

            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }

            for (int i = arr.length - 1; i >= 0; i--) {
                int digit = (arr[i] / jarisu) % 10;
                output[bucket[digit] - 1] = arr[i];
                bucket[digit]--;
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i] = output[i];
            }

            jarisu *= 10;
        }
    }
}
