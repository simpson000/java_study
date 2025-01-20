package Javamid2.collection.map;

import java.util.*;

public class JavaMapMain {

    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());


    }

    private static void run(Map<String, Integer> map) {
        //System.out.println(map);

        map.put("C", 10);
        map.put("A", 20);
        map.put("B", 30);
        map.put("C", 40);
        map.put("1", 50);
        map.put("2", 60);

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }
        System.out.println();

    }
}
