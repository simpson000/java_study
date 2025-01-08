package algorisum.strcture.secondweek;

import java.util.Scanner;

public class 버블소트프로그램2 {
    public static int n,arr[],temp[];
    public static long swap;
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        temp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        swap = 0;

        merget_sort(0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(swap);


    }

    private static void merget_sort(int start, int end) {
        if (start>=end) {
            return;
        }
        int mid = start + (end - start) / 2;
        merget_sort(start, mid);
        merget_sort(mid + 1, end);
        for (int i = start; i <= end; i++) {
            temp [i]= arr[i];
        }
        int count=start;
        int index1 = count;
        int index2 = mid + 1;
        while (index1 <= mid && index2 <= end) {
            if (temp[index1] < temp[index2]) {
                arr[count++] = temp[index1++];
            }else {
                arr[count] = temp[index2];
                swap=swap+index2-count;
                count++;
                index2++;

            }
        }
        while (index1 <= mid) {
            arr[count++] = temp[index1++];
        }
        while (index2 <= end) {
            arr[count++] = temp[index2++];
        }




    }
}
