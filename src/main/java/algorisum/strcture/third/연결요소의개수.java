package algorisum.strcture.third;

import java.util.ArrayList;
import java.util.Scanner;

public class 연결요소의개수 {
    static ArrayList<Integer>[] Array;
    static boolean[] visited;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int line = sc.nextInt();
        Array  = new ArrayList[node+1];
        visited = new boolean[node + 1];

        for (int i = 1; i < node + 1; i++) {
            Array[i] = new ArrayList<>();
        }
        for (int i = 0; i < line; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Array[a].add(b);
            Array[b].add(a);
        }
        int count = 0;
        for (int i =1 ; i<node+1; i++) {
            if (visited[i] == false) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);

    }

    private static void DFS(int i) {
        if (visited[i] == true) {
            return;
        }
        visited[i] = true;
        for (int j : Array[i]) {
            if (!visited[j]) {
                DFS(j);
            }
        }
    }
}
