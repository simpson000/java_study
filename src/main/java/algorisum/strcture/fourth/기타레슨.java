package algorisum.strcture.fourth;

import java.util.*;

public class 기타레슨 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();    // 레슨 개수
        int M = sc.nextInt();    // 블루레이 개수
        int[] lessons = new int[N];

        // 레슨 길이 입력받기
        for (int i = 0; i < N; i++) {
            lessons[i] = sc.nextInt();
        }

        // 결과 출력
        System.out.println(findMinBlueraySize(lessons, M));
    }

    private static int findMinBlueraySize(int[] lessons, int M) {
        // 이진탐색 시작값과 끝값 설정
        int start = 0;   // 시작값
        int end = 0;     // 끝값

        // 시작값은 가장 긴 레슨의 길이
        // 끝값은 모든 레슨 길이의 합
        for (int i = 0; i < lessons.length; i++) {
            if (start < lessons[i]) {
                start = lessons[i];
            }
            end += lessons[i];
        }

        // 이진탐색 시작
        while (start <= end) {
            int mid = (start + end) / 2;  // 중간값 (블루레이 크기)
            int sum = 0;    // 현재 블루레이에 들어간 레슨 길이
            int count = 1;  // 사용한 블루레이 개수

            // 모든 레슨을 현재 크기(mid)로 나눠담을 수 있는지 확인
            for (int lesson : lessons) {
                if (sum + lesson > mid) {
                    count++;
                    sum = lesson;
                } else {
                    sum += lesson;
                }
            }

            // 필요한 블루레이 개수에 따라 크기 조정
            if (count <= M) {
                end = mid - 1;    // 크기를 줄여봄
            } else {
                start = mid + 1;  // 크기를 늘려봄
            }
        }

        return start;
    }
}