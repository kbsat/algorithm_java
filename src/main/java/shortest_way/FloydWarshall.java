package shortest_way;

import java.util.Arrays;
import java.util.Scanner;

public class FloydWarshall {
    public static final int INF = (int) 1e9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        // 그래프 초기화
        int[][] graph = new int[v + 1][v + 1];

        for (int i = 0; i <= v; i++) {
            for (int j = 0; j <= v; j++) {
                if(i == j) graph[i][j] = 0;
                else graph[i][j] = INF;
            }
        }
        for (int i = 0; i < e; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int weight = sc.nextInt();
            // t1 -(t2)-> t3
            graph[from][to] = weight;
        }

        // 플로이드 워셜동작
        for (int k = 1; k <= v; k++) {
            for (int a = 1; a <= v; a++) {
                for (int b = 1; b <= v; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= v; j++) {
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }


    }
}
