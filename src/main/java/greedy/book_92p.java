package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 큰 수의 법칙
public class book_92p {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        // 가장 큰 수 두 개
        int first = arr[0];
        int second = arr[1];

        int sumCycle = 0;
        for (int i = 0; i < k; i++) {
            sumCycle += first;
        }
        sumCycle += second;

        int cycleNum = m / (k + 1);
        int remainNum = m % (k + 1);

        answer = (cycleNum * sumCycle) + (first * remainNum);

        System.out.println(answer);
    }
}
