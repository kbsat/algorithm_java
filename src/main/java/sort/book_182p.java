package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class book_182p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Integer[] arrA = new Integer[N];
        Integer[] arrB = new Integer[N];

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB, Comparator.reverseOrder());

        for (int i = 0; i < K; i++) {
            if(arrA[i] < arrB[i]){
                int temp = arrA[i];
                arrA[i] = arrB[i];
                arrB[i] = temp;
            }else{
                break;
            }
        }

        // arrA의 총합
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arrA[i];
        }

        System.out.println(sum);

    }
}
