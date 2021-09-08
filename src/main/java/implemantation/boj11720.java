package implemantation;

import java.util.Scanner;

// 숫자의 합
public class boj11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int sum = 0;

        char[] chars = str.toCharArray();
        for (int i = 0; i < n; i++) {
            int numericValue = Character.getNumericValue(chars[i]);
            sum += numericValue;
        }
        System.out.println(sum);
    }
}
