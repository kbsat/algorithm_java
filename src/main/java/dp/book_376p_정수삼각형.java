package dp;

import java.util.Arrays;
import java.util.Scanner;

public class book_376p_정수삼각형 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int[][] arr = new int[height][height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j < i + 1) {
                    arr[i][j] = sc.nextInt();
                } else {
                    arr[i][j] = 10000;
                }

            }
        }

        int[][] d = new int[height][height];
        d[0][0] = arr[0][0];

        for (int x = 1; x < height; x++) {
            for (int y = 0; y < x + 1; y++) {
                if (y - 1 >= 0) {
                    if (arr[x - 1][y] == 10000) {
                        d[x][y]= d[x-1][y-1] + arr[x][y];
                    }
                    d[x][y] = Math.max(d[x-1][y-1],d[x-1][y]) + arr[x][y];
                } else {
                    d[x][y] = d[x-1][y] + arr[x][y];
                }
            }
        }

        int[] results = new int[height];
        for (int i = 0; i < height; i++) {
            results[i] = d[height-1][i];
        }

        int result = Arrays.stream(results).max().getAsInt();
        System.out.println(result);

    }
}
