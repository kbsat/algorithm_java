package greedy;

import java.util.Scanner;

public class book_99p {
    public static void main(String[] args) {
        // N에서 1을 뺀다
        // N을 K로 나눈다.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int cnt = 0;
        while(N > 1){
            if (N % K == 0) {
                N = N / K;
            }else{
                N -= 1;
            }
            cnt ++;
        }

        System.out.println(cnt);
    }
}
