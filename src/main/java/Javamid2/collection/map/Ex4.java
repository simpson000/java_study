package Javamid2.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex4 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);


        for (String s : map.keySet()) {
            if (map.get(s) == 1000) {
                System.out.println(s);
            }
        }
    }
}
