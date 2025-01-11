package algorisum.strcture.third;

import java.util.Queue;
import java.util.*;
import java.util.Scanner;

public class 미로탐색 {
    static int maze[][];
    static int[] dx = {-1, 1, 0, 0};  // 상하좌우 이동을 위한 배열
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int N;
    static int M;
    static Queue<int []> queue;

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
                maze[i][j] = line.charAt(j) - '0';//문자를 숫자로반환
            }
        }
        bfs(0, 0);
        System.out.println(maze[N - 1][M - 1]);
    }

    private static void bfs(int i, int j) {
        queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0], y = poll[1];
            // 4방향 탐색
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                // 범위 체크
                if (nx < 0 || ny < 0 || nx >= N || ny >= M)
                    continue;

                // 벽이거나 이미 방문한 곳이면 스킵
                if (maze[nx][ny] == 0 || visited[nx][ny])
                    continue;

                // 방문 처리
                visited[nx][ny] = true;
                maze[nx][ny] = maze[x][y] + 1;  // 이동 거리 증가
                queue.add(new int[]{nx, ny});
                }
            }
        }

    }

