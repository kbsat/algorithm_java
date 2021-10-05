package dp;

import java.util.Scanner;

public class book_377p_퇴사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n + 1][3];

        // [i][0] : T, [i][1] : P,  [i][2] : 일이 끝나는 날짜 ( i + T - 1)
        for (int i = 1; i <= n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = arr[i][0] + i - 1;
        }

        int[] d = new int[n+1];

        for (int i = 1; i <= n; i++) {
            int max = -1;
            int idx = -1;
            for (int x = i - 4; x <= i; x++) {
                if(x <= 0){
                    continue;
                }

                if(arr[x][2] == i && (d[x-1] +arr[x][1]) >= max){
                    idx = x;
                    max = d[idx-1] + arr[x][1];
                }
            }
            if(idx != -1){
                d[i] = Math.max(max, d[i-1]);
            }else{
                d[i] = d[i-1];
            }
        }

        System.out.println(d[n]);
    }
}
