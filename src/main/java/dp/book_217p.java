package dp;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

// 1로 만들기
public class book_217p {
    public static void main(String[] args) {
        int[] arr = new int[30001];

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=2;i<=num;i++){

            arr[i] = arr[i-1] + 1;

            if(i % 2 == 0){
                arr[i] = Math.min(arr[i], arr[i/2] + 1);
            }
            if(i % 3 == 0){
                arr[i] = Math.min(arr[i], arr[i/3] + 1);
            }
            if(i % 5 == 0){
                arr[i] = Math.min(arr[i], arr[i/5] + 1);
            }

        }

        System.out.println(arr[num]);
    }
}
