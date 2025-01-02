package algorisum.strcture.secondweek;

import java.util.Scanner;

public class 퀵정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        quick(arr, 0, size-1,k-1);
        System.out.println(arr[k-1]);
    }

    private static void quick(int[] arr, int left, int right, int k) {
        if (left >= right) {
            return;
        }
        int pivot = partition(arr, left, right);

        if (pivot == k) {
            return;
        } else if (k < pivot) {
            quick(arr, left, pivot - 1, k);  // k가 pivot보다 작으면 왼쪽 부분 탐색
        } else {
            quick(arr, pivot + 1, right, k); // k가 pivot보다 크면 오른쪽 부분 탐색
        }
    }
//start는 pivot값 보다 작은 값들을 무시 하면서 간다
    //end는 반대로 큰 값들을 무시하면서 간다
    static int partition(int[] arr, int start, int end) {
        // 1. 마지막 원소를 피벗으로 선택
        int pivot = arr[end];
        int i = start - 1;  // 피벗보다 작은 값들의 경계

        // 2. 모든 원소를 피벗과 비교
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;  // 경계를 오른쪽으로 이동
                swap(arr, i, j);  // 현재 원소를 경계로 이동
            }
        }

        // 3. 피벗을 적절한 위치로 이동
        swap(arr, i+1, end);
        return i + 1;  // 피벗의 최종 위치 반환
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
