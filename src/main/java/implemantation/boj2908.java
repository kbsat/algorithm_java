package implemantation;

import java.util.Scanner;

// 상수
public class boj2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        StringBuffer sb = new StringBuffer();
        int firstNum = Integer.parseInt(sb.append(first).reverse().toString());
        sb.setLength(0);
        int secondNum = Integer.parseInt(sb.append(second).reverse().toString());

        System.out.println(Math.max(firstNum,secondNum));


    }
}

