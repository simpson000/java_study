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
        while (left <= right) {
            int pivot = partition(arr, left, right);

            if (pivot == k) return;
            else if (k < pivot) right = pivot - 1;
            else left = pivot + 1;
        }
    }
//start는 pivot값 보다 작은 값들을 무시 하면서 간다
    //end는 반대로 큰 값들을 무시하면서 간다
static int partition(int[] arr, int start, int end) {
    int pivotIdx = start + (int)(Math.random() * (end - start + 1));
    swap(arr, pivotIdx, end);
    return partitionLogic(arr, start, end);
}

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partitionLogic(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return i + 1;
    }
}
