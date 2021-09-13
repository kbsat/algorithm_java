package dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 미로 탈출
public class book_152p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            char[] chars = sc.next().toCharArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = chars[j] - '0';
            }
        }


        bfs(map);
        int result = map[N - 1][M - 1];

        System.out.println(result);

    }

    private static void bfs(int[][] map) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{0, 0});
        int[] dx = new int[]{0, 0, -1, 1};
        int[] dy = new int[]{-1, 1, 0, 0};

        while (queue.size() >= 1) {
            Integer[] nowIdx = queue.remove();

            // 일단 큐에 삽입
            for (int i = 0; i < 4; i++) {
                int x = nowIdx[0] + dx[i];
                int y = nowIdx[1] + dy[i];

                if (x > -1 && x < map.length && y > -1 && y < map[0].length && map[x][y] == 1) {
                    map[x][y] = map[nowIdx[0]][nowIdx[1]] + 1;
                    queue.add(new Integer[]{x, y});
                }

            }
        }


    }
}
