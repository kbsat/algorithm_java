package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class book_375p_금광 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCaseNum = sc.nextInt();
        List<int[][]> list = new ArrayList<>();

        for (int i = 0; i < testCaseNum; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] array = new int[n][m];

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    array[j][k] = sc.nextInt();
                }
            }

            list.add(array);

        }


        for (int[][] arr : list) {

            // x가 행 y가 열
            int x_max = arr.length;
            int y_max = arr[0].length;
            int[][] d = new int[x_max][y_max];

            // 첫 열의 값 설정
            for (int i = 0; i < x_max; i++) {
                d[i][0] = arr[i][0];
            }

            for (int y = 1; y < y_max; y++) {

                for (int x = 0; x < x_max; x++) {

                    if (x - 1 >= 0 && x + 1 < x_max) {
                        d[x][y] = Math.max(Math.max(d[x - 1][y - 1], d[x][y - 1]), d[x + 1][y - 1]) + arr[x][y];
                    } else if (x - 1 < 0 && x + 1 >= x_max) {
                        d[x][y] = d[x][y - 1] + arr[x][y];
                    } else if (x - 1 < 0) {
                        d[x][y] = Math.max(d[x][y - 1], d[x + 1][y - 1]) + arr[x][y];
                    } else if (x + 1 >= x_max) {
                        d[x][y] = Math.max(d[x - 1][y - 1], d[x][y - 1]) + arr[x][y];
                    }

                }
            }

            int[] last = new int[x_max];
            for (int i = 0; i < x_max; i++) {
                last[i] = d[i][y_max-1];
            }
            int max = Arrays.stream(last).max().getAsInt();

            System.out.println(max);
        }


    }
}
