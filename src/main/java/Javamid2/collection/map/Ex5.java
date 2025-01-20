package Javamid2.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        System.out.println("==단어 입력 단계==");
        Scanner sc = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();

        while (true) {
            System.out.println("영어단어를 입력하세요(종료는 'q'):");
            String word = sc.nextLine();
            if (word.equals("q")) {
                break;
            }
            System.out.println("한글 뜻을 입력하세요:");
            String meaning = sc.nextLine();
            map.put(word,meaning);

        }
        System.out.println("==단어 출력 단계==");

        while (true) {
            System.out.println("찾을 영어단어를 입력하세요(종료는 'q'):");
            String serach = sc.nextLine();
            if (serach.equals("q")) {
                break;
            }
            if (map.containsKey(serach)) {
                System.out.println("한글 뜻:"+map.get(serach));
            }
            else {
                System.out.println(serach + "는 사전에 없는 단어입니다");
            }
        }
    }
}
