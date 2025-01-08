package algorisum.strcture.third;

import java.util.*;

public class 바이러스 {
    static ArrayList<Integer>[] lists;
    static boolean[] visited;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        sc.nextLine();
        int edges = sc.nextInt();
        lists = new ArrayList[node + 1];
        visited = new boolean[node + 1];
        for (int i = 1; i < node+1; i++) {
            lists[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lists[a].add(b);
            lists[b].add(a);
        }
        DFS(1);
        System.out.println(count-1);
    }

    private static void DFS(int i) {
        visited[i] = true;
        count++;
        for (int v : lists[i]) {
            if (!visited[v]) {
                DFS(v);
            }
        }
    }
}
