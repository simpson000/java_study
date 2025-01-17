package algorisum.strcture.fifth;

import java.util.Scanner;

public class 소수구하기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 수의 개수 입력
        int N = sc.nextInt();
        int count = 0;  // 소수의 개수를 저장할 변수

        // N개의 수를 입력받으면서 각각이 소수인지 확인
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(isPrime(num)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 소수인지 판별하는 함수
    public static boolean isPrime(int num) {
        // 1은 소수가 아님
        if(num == 1) return false;

        // 2부터 num-1까지 나눠보기
        for(int i = 2; i < num; i++) {
            // 하나라도 나누어떨어지면 소수가 아님
            if(num % i == 0) {
                return false;
            }
        }

        // 어떤 수로도 나누어떨어지지 않으면 소수
        return true;
    }

}
