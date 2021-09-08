package implemantation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문자열 반복
public class boj2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String str = sc.next();
            char[] toCharArray = str.toCharArray();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < r; k++) {
                    sb.append(toCharArray[j]);

                }
            }
            list.add(sb.toString());
            sb.setLength(0);
        }

        list.forEach(System.out::println);
    }
}
