package algorisum.strcture.fifth;

import java.util.Scanner;

public class 에라토스테네스체 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1 ];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        int count = 0;  // 지워진 수의 개수

        // 에라토스테네스의 체 수행
        for(int i = 2; i <= n; i++) {  // 1은 제외하고 2부터 시작
            // i가 남아있는 수라면
            if(arr[i] != 0) {
                // i 자신을 지움
                arr[i] = 0;
                count++;

                // K번째 수를 찾았다면 출력
                if(count == m) {
                    System.out.println(i);
                    break;
                }

                // i의 배수들을 지움
                for(int j = i + i; j <= n; j += i) {
                    if(arr[j] != 0) {  // 아직 지워지지 않은 수라면
                        arr[j] = 0;
                        count++;

                        // K번째 수를 찾았다면 출력
                        if(count == m) {
                            System.out.println(j);
                            break;
                        }
                    }
                }
            }

            // K번째 수를 찾았다면 종료
            if(count == m) break;
        }
    }
}
