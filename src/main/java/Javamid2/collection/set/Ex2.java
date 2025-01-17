package Javamid2.collection.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

//        //합집합:
//        교집함:
//        차집합:
//        //

        Set<Integer> all = new HashSet<>();
        all.addAll(set);
        all.addAll(set2);
        System.out.println(all);
        Set<Integer> gao = new HashSet<>();
        Set<Integer> gao2 = new HashSet<>();
        for (Integer i : set) {
            if (set2.contains(i)) {
                gao.add(i);
            }
            else {
                gao2.add(i);
            }
        }
        System.out.println(gao);
        System.out.println(gao2);

    }
}
