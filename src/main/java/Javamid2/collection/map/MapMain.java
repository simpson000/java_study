package Javamid2.collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapMain {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        System.out.println(map);

        Integer result = map.get("A");
        //System.out.println(result);

        Set<String> set = map.keySet();
        for (String s : set) {
            Integer value = map.get(s);
            System.out.println(value);
        }
        Set<Map.Entry<String, Integer>> set2 = map.entrySet();
        for (Map.Entry<String, Integer> entry : set2) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
