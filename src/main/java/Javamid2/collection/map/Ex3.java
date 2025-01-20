package Javamid2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {

    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";

        Map<String , Integer> map = new HashMap<>();

        String[] words = text.split(" ");
        for (String word : words) {
            if (map.get(word) == null) {
                map.put(word, 1);
            }
            else {
                map.put(word, map.get(word) + 1);
            }

        }
        System.out.println(map);
    }
}
