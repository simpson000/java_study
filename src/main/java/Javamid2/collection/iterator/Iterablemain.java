package Javamid2.collection.iterator;

import java.util.*;

public class Iterablemain {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printIterator(list.iterator());
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printIterator(set.iterator());
        foreach(set);


    }

    private static void foreach(Iterable<Integer> list) {
        for (Integer value : list) {
            System.out.println(value);
        }
    }

    private static void printIterator(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }
}
