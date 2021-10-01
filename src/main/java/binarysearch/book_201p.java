package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class book_201p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 떡의 개수
        int m = sc.nextInt(); // 손님이 요청한 떡 길이

        int[] riceCakes = new int[n];
        for (int i = 0; i < n; i++) {
            riceCakes[i] = sc.nextInt();
        }

        Arrays.sort(riceCakes);

        int start = 0;
        int end = riceCakes[n-1];
        int total;
        int mid;
        int result = 0;

        while(start <= end){
            mid = ( start + end ) / 2;

            total = getTotal(riceCakes, mid);
            // 자른 떡의 양이 부족할 경우
            if( total < m ){
                end = mid - 1;
            }else{
                result = mid;
                start = mid + 1;
            }
        }

        System.out.println(result);
    }

    public static int getTotal(int[] riceCakes, int cutterLen){
        int total = 0 ;
        for (int riceCake : riceCakes) {
            if(riceCake > cutterLen){
                total += riceCake - cutterLen;
            }
        }

        return total;
    }
}
