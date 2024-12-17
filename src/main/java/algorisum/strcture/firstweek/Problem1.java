package algorisum.strcture.firstweek;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

//11720
        // 1. 공백이 쓰여 있다 모두 합산 해서 출력
        // 2. 첫 int 받고 54321로 받는데 100이 되면 int double 불가능
        // 3. 따라서 String을 사용해야 할듯
        // 4. String으로 받고 읻것을 char로 나눠서 저장하고 result에 차례로 더하자

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int result=0;
        for (char ch : str.toCharArray()) {
            result += ch - '0';
        }
        System.out.println(result);

    }
}
