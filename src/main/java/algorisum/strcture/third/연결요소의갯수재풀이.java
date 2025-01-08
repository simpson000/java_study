package algorisum.strcture.third;

import java.util.ArrayList;
import java.util.Scanner;

public class 연결요소의갯수재풀이 {
    static ArrayList<Integer>[] lists;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edge = sc.nextInt();

        lists = new ArrayList[node+1];
        visited = new boolean[node + 1];
        for (int i = 1; i < node+1; i++) {
            lists[i] = new ArrayList<>();
        }
        for (int i = 0; i < edge; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lists[a].add(b);
            lists[b].add(a);
        }
        int count=0;
        for (int i = 1; i < node + 1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }

        }
        System.out.println(count);



    }

    static void DFS(int i) {
        if (visited[i]) {
            return;
        }
        visited[i] = true;
        for (int v : lists[i]) {
            if (!visited[v]) {
                DFS(v);

            }

        }

    }
}
