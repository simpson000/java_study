package algorisum.strcture.firstweek;

import java.util.Scanner;
import java.util.Stack;

public class 스택 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<Integer>();
        int num = 1;
        StringBuilder result = new StringBuilder();
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            while (num <= arr[i]) {
                stack.push(num++);
                result.append("+\n");
            }

            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
                result.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.print(result);
        } else {
            System.out.println("NO");
        }
    }
}
