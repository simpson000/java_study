package algorisum.strcture.secondweek;

import java.util.Scanner;

public class 선택정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] chars = str.toCharArray();
        int [] arr = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            arr[i] = chars[i]-'0';
        }
        for (int i = 0; i < arr.length; i++) {
            int max_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[max_index]) {
                    max_index = j;
                }
            }
            // 최대값과 현재 위치 교환
            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;
        }

// 정순 출력 (이미 내림차순 정렬됨)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }
}
