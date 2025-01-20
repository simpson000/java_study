package Javamid2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {

    public static void main(String[] args) {

        String[][] productArr = {{"java", "100000"}, {"Spring", "200000"}, {"JPA", "30000"}};

        Map<String, Integer> map = new HashMap<>();
        for (String[] strings : productArr) {
            map.put(strings[0], Integer.parseInt(strings[1]));
        }
        for (String s : map.keySet()) {
            System.out.println("제품: "+s+" 가격:"+map.get(s));
        }
    }
}
