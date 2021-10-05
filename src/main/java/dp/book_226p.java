package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class book_226p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] money = new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = sc.nextInt();
        }
        Arrays.sort(money);

        int[] d = new int[m + 1];
        Arrays.fill(d, 10001);

        d[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = money[i]; j <= m; j++) {
                if (d[j - money[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j - money[i]] + 1);
                }
            }
        }

        if(d[m] == 10001){
            System.out.println("-1");
        }
        else{
            System.out.println(d[m]);
        }
    }
}
