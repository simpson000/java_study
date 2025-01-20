package Javamid2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("b", 4);
        map2.put("c", 5);
        map2.put("d", 6);
        Map<String, Integer> map3 = new HashMap<>();

        for (String s : map2.keySet()) {
            if (map.containsKey(s)) {
                map3.put(s, map.get(s) + map2.get(s));

            }

        }
        System.out.println(map3);
    }
}
