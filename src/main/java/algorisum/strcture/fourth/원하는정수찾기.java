package algorisum.strcture.fourth;

import java.util.*;

public class 원하는정수찾기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int [] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < find; i++) {
            int find_num = sc.nextInt();
            System.out.println(binarySerach(arr,find_num));
        }
    }

    private static int binarySerach(int[] arr, int findNum) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == findNum) {
                return 1;
            }
            else if (arr[mid] < findNum) {
                start = mid + 1;

            }
            else {
                end = mid - 1;
            }


        }
        return 0;
    }
}
