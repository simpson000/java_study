package Javamid2.collection.set;

import java.util.*;

public class Ex1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
//        Set<Integer> set1 = new HashSet<>();
//        for (Integer i : inputArr) {
//            set1.add(i);
//        }
//        for (Integer i : set1) {
//            System.out.println(i);
//        }
//        Set<Integer> set2 = new LinkedHashSet<>(List.of(inputArr));
//        for (Integer i : set2) {
//            System.out.println(i);
//        }
        Set<Integer> set3 = new TreeSet<>(List.of(inputArr));
        for (Integer i : set3) {
            System.out.println(i);
        }
    }
}
