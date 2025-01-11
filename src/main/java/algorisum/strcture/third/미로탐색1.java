package algorisum.strcture.third;

import java.util.*;

public class 미로탐색1 {
    //상하좌우 순서
    static int[] dx = {-1, 1, 0, 0};  // 행 이동
    static int[] dy = {0, 0, -1, 1};  // 열 이동
    static int maze[][];
    static boolean[][] visited;
    static int N;
    static int M;
    static Queue<int []> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        maze = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }
        bfs(0, 0);
        System.out.println(maze[N - 1][M - 1]);


    }

    private static void bfs(int i, int j) {
        queue.add(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int [] p = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nx = p[0] + dx[k];
                int ny = p[1] + dy[k];

                if (N <= nx || M <= ny || nx < 0 || ny < 0) {
                    continue;
                }
                if (maze[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    maze[nx][ny] = maze[p[0]][p[1]] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }

    }
}
