package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class book_97p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr));
    }

    public static int solution(int[][] arr) {
        // 행의 가장 최소값
        Integer[] minArr = new Integer[arr.length];
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++){
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
            minArr[i] = min;
            min = 100;
        }

        Arrays.sort(minArr, Collections.reverseOrder());

        return minArr[0];
    }

}

