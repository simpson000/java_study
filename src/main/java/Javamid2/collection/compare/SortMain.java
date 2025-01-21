package Javamid2.collection.compare;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        Integer[] a = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
