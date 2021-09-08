package implemantation;

import java.util.Scanner;

// 단어의 개수
public class boj1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String trimedStr = str.trim();

        if(trimedStr.equals("")){
            System.out.println("0");
            return;
        }
        String[] s = trimedStr.split(" ");

        System.out.println(s.length);

    }
}
