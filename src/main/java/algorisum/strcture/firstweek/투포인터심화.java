package algorisum.strcture.firstweek;

import java.util.Arrays;
import java.util.Scanner;

public class 투포인터심화 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            int target = arr[i];  // 현재 만들고 싶은 수

            // 6. 투 포인터 설정
            int left = 0;          // 왼쪽부터 시작하는 포인터
            int right = n - 1;     // 오른쪽부터 시작하는 포인터

            // 7. 두 포인터가 만나기 전까지 반복
            while (left < right) {
                // 8. 현재 가리키는 두 수의 합 계산
                int sum = arr[left] + arr[right];

                // 9. 두 수의 합이 타겟과 같으면
                if (sum == target) {
                    // 단, left나 right가 현재 수의 위치(i)와 같지 않아야 함
                    if (left != i && right != i) {
                        count++;  // 좋은 수 발견!
                        break;    // 다음 타겟으로 넘어감
                    }
                    // 하나라도 현재 위치와 같다면 left를 이동
                    left++;
                }
                // 10. 합이 타겟보다 작으면 더 큰 수가 필요하므로 left 증가
                else if (sum < target) {
                    left++;
                }
                // 11. 합이 타겟보다 크면 더 작은 수가 필요하므로 right 감소
                else {
                    right--;
                }
            }
        }
        System.out.println(count);
    }
}
