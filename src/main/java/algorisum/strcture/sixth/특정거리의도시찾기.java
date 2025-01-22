package algorisum.strcture.sixth;

import java.util.*;

public class 특정거리의도시찾기 {
    static int n,m,k,x;
    static int[] visited ;
    static ArrayList<Integer>[] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//노드갯수
        m = sc.nextInt();//에지개수
        k = sc.nextInt();//목표거리
        x = sc.nextInt();//시작점

        visited = new int[n+1];
        list = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
        }
        BFS(x);
        ArrayList<Integer> ans = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            if (visited[i] == k) {
                ans.add(i);
            }
        }
        if (ans.isEmpty()) {
            System.out.println("-1");
        }
        else {
            Collections.sort(ans);
            for (Integer an : ans) {
                System.out.println(an);
            }
        }




    }

    private static void BFS(int x) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(x);
        visited[x] = 0;
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int i : list[cur]) {
                if (visited[i] == 0&&x!=i) {
                    q.offer(i);
                    visited[i] = visited[cur] +1;
                }
            }

        }

    }
}
