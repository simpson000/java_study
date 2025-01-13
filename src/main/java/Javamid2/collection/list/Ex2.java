package Javamid2.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        System.out.println("n개의 정수를 입력하세요(종료0)");

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);
        }
        for (Integer i : list) {
            System.out.print(i+" ");
        }
    }

}
