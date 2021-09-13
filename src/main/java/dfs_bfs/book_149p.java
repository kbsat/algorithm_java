package dfs_bfs;

import java.util.Arrays;
import java.util.Scanner;

// 음료수 얼려먹기
public class book_149p {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] iceTool = new int[N][M];
        boolean[][] visited = new boolean[N][M];


        int count = 0;
        // 입력
        for (int i = 0; i < N; i++) {
            String input = sc.next();
            char[] chars = input.toCharArray();
            for (int j = 0; j < M; j++) {
                iceTool[i][j] = chars[j] - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dfs(iceTool, visited, i, j) == true) {
                    count += 1;
                }
            }
        }

        System.out.println(count);

    }

    public static boolean dfs(int[][] iceTool, boolean[][] visited, int startX, int startY) {
        // 장외일 경우 처리
        if (startX < 0 || startX >= visited.length || startY < 0 || startY >= visited[0].length) {
            return false;
        }

        // 막대기 부분일 경우 처리
        if (iceTool[startX][startY] == 1) {
            return false;
        }

        // 방문하지 않았을 때 처리
        if (!visited[startX][startY]) {
            visited[startX][startY] = true;

            dfs(iceTool, visited, startX, startY + 1);
            dfs(iceTool, visited, startX, startY - 1);
            dfs(iceTool, visited, startX + 1, startY);
            dfs(iceTool, visited, startX - 1, startY);

            return true;
        }

        return false;
    }
}
