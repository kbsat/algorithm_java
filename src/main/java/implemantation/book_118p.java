package implemantation;

import java.util.Arrays;
import java.util.Scanner;

// 게임 개발
public class book_118p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int nowD = sc.nextInt();

        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int[][] go = new int[][]{
                {-1, 0}, {0, 1}, {1, 0}, {0, -1} // 북 0 동 1 남 2 서 3
        };
        int[][] back = new int[][]{
                {1, 0}, {0, -1}, {-1, 0}, {0, 1}
        };

        // 시작지점 초기화
        int[] now = new int[]{startX, startY};
        boolean isGo = false;
        int result = 1; // 처음간곳은 갔다고 침

        while (true) {
            int nextX = 0;
            int nextY = 0;
            isGo = false;
            map[now[0]][now[1]] = 2;

            // 4방향 순회
            for (int i = 0; i < 4; i++) {
                nextX = now[0] + go[nowD][0];
                nextY = now[1] + go[nowD][1];

                // 맵 내부인지 확인
                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {
                    // 미확인육지인지 확인
                    if (map[nextX][nextY] == 0) {
                        now[0] = nextX;
                        now[1] = nextY;
                        isGo = true;
                        result += 1;
                        break;
                    }
                }

                // 해당 방향에 갈곳이 없다면 방향회전
                nowD -= 1;
                if (nowD < 0) {
                    nowD = 3;
                }
            }

            // 4방향을 다돌고도 갈곳이 없다면
            if (!isGo) {
                nextX = now[0] + back[nowD][0];
                nextY = now[1] + back[nowD][1];

                // 맵안쪽인지 확인
                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {
                    if(map[nextX][nextY] == 1){
                        break;
                    }
                    now[0] = nextX;
                    now[1] = nextY;
                }else{
                    break;
                }
            }
        }

        System.out.println(result);

    }
}
