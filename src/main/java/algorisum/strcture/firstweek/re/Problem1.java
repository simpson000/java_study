package algorisum.strcture.firstweek.re;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        //중요한 포인트는 아스키 코드를 적용 시키는 것과 String의 특징을 이용하는 것 그리고 다른 타입으로 변환하는 과정

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for (char c : s.toCharArray()){
            count += c - '0';
        }
        System.out.println(count);
    }
}
