package algorisum.strcture.third;

import java.util.*;

public class DFS와BFS프로그램 {
    static LinkedList<Integer>[] link;
    static boolean [] vistied;
    static Queue<Integer> queue;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();
        int start = sc.nextInt();
        vistied = new boolean[nodes + 1];
        link = new LinkedList[nodes + 1];
        for (int i = 1; i <= nodes; i++) {
            link[i] = new LinkedList<>();
        }
        for (int i = 0; i < edges; i++) {
            int f= sc.nextInt();
            int s = sc.nextInt();
            link[f].add(s);
            link[s].add(f);
        }
        for (int i = 1; i < nodes+1; i++) {
            Collections.sort(link[i]);
        }
        dfs(start);
        System.out.println();
        vistied = new boolean[nodes + 1];
        bfs(start);

    }

    private static void bfs(int start) {
        queue = new LinkedList<>();
        queue.add(start);
        vistied[start] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " ");
            for (int next : link[cur]) {
                if (!vistied[next]) {
                    queue.add(next);
                    vistied[next] = true;
                }
            }
        }

    }

    private static void dfs(int start) {
        if (vistied[start]) {
            return;
        }
        vistied[start] = true;
        System.out.print(start+" ");

        for (Integer i : link[start]) {
            if (!vistied[i]) {
                dfs(i);
            }
        }
    }
}
