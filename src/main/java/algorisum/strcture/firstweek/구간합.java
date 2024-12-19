package algorisum.strcture.firstweek;

import java.util.Scanner;

public class 구간합 {
    public static void main(String[] args) {
        //여기서 포인트는 바로 시간 복잡도를 먼저 한번 보기 + 구간합을 사용하기
        //그리고 여기서 배열보다 1개를 더 만들어서 사용왜냐하면 첫 first를 택하면 first-1이 있기 때문
        Scanner sc = new Scanner(System.in);
        int suNo = sc.nextInt();
        int quizNo = sc.nextInt();
        int [] arr = new int[suNo+1];
        int [] result = new int[quizNo]; ;
        for (int i = 1; i < suNo+1; i++) {
            arr[i] =arr[i-1]+ sc.nextInt();
        }
        for (int i = 0; i < quizNo; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            result[i] +=(arr[second] - arr[first-1]);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
