package algorisum.strcture.secondweek;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA == absB) {
                return a >b?1:-1;
            }
            return absA - absB;  // 절대값 비교
        });
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                if (pq.isEmpty()) {
                    System.out.println("0");

                }
                else {
                    System.out.println(pq.poll());

                }
            }
            else {
                pq.add(x);
            }

        }
    }
}
