package binarysearch;

import java.util.Arrays;
import java.util.Scanner;


public class book_197p {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);

        for (int i = 0; i < M; i++) {
            boolean isExist = binarySearch(arr1, 0, arr1.length - 1, arr2[i]);
            if (isExist) {
                System.out.print("yes ");
            } else {
                System.out.print("no ");
            }
        }
    }

    public static boolean binarySearch(int[] arr, int start, int end, int target) {

        if (start > end) {
            return false;
        }

        int half = (start + end) / 2;

        if (arr[half] == target) {
            return true;
        } else if (arr[half] > target) {
            return binarySearch(arr, start, half - 1, target);
        } else {
            return binarySearch(arr, half + 1, end, target);
        }

    }
}
