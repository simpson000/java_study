package algorisum.strcture.third;

import java.util.*;

public class DFSBFS {
    static ArrayList<Integer>[] link;
    static boolean[] visited;
    static Queue<Integer> queue;


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edges=sc.nextInt();
        int start=sc.nextInt();
        link = new ArrayList[node + 1];
        for (int i = 1; i < node+1; i++) {
            link[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            link[to].add(from);
            link[from].add(to);
        }
        visited = new boolean[node+1];
        dfs(start);
        System.out.println();
        visited = new boolean[node+1];
        bfs(start);

    }

    private static void bfs(int node) {
        queue= new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " ");
            for (int i : link[cur]) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }

    private static void dfs(int node) {
        if (visited[node]){
            return;
        }
        visited[node] = true;
        System.out.print(node+" ");
        for (int i : link[node]) {
            if (!visited[i]) {
                dfs(i);
            }
        }

    }


}
