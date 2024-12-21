package algorisum.strcture.firstweek;

import java.util.Scanner;

public class 슬라이딩윈도우 {
    static char arr[];
    static int check[];
    static int myArr[];
    static int checkSecret; // 4개가 즉 다 맞으면 result +1한다

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // dna 문자열의 킈기
        int m = sc.nextInt(); // 부분 문자열의 크기
        sc.nextLine();
        String str = sc.nextLine();
        arr = str.toCharArray();
        checkSecret = 0;
        check = new int[4]; //부문 문자열의 정답을 받기 a c g t순
        myArr = new int[4]; // 문자열에서 4개로 만들기
        for (int i = 0; i < 4; i++) {
            check[i] = sc.nextInt();
            if(check[i] == 0) { // 필요한 개수가 0인 경우 이미 조건 만족
                checkSecret++;
            }
        }
        int result =0; // 최종 카운트
        char [] myArr = new char[m];
        for (int i = 0; i < m; i++) {   //우선 최초로 add 한다 즉 m 만큼 넣어줌
            Add(arr[i]);
        }
        if (checkSecret == 4) {
            result ++;
        }
        for (int i = m; i < n; i++) {   //슬라이딩 윈도우
            Add(arr[i]);
            Remove(arr[i - m]);
            if (checkSecret == 4) {
                result++;
            }
        }

        System.out.println(result);


    }
    public static void Add(char ch) {
        switch (ch) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == check[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == check[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == check[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == check[3]) {
                    checkSecret++;
                }
                break;



        }
    }
    public static void Remove(char ch) {    // 여기서 먼저 검사를 하고 뒤에 --를 투입한다
        switch (ch) {
            case 'A':
                if (myArr[0] == check[0]) {
                    checkSecret--;
                }
                myArr[0]--;

                break;
            case 'C':
                if (myArr[1] == check[1]) {
                    checkSecret--;
                }
                myArr[1]--;

                break;
            case 'G':
                if (myArr[2] == check[2]) {
                    checkSecret--;
                }
                myArr[2]--;

                break;
            case 'T':
                if (myArr[3] == check[3]) {
                    checkSecret--;
                }
                myArr[3]--;

                break;


        }
    }
}
