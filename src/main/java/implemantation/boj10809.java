package implemantation;

import java.util.Arrays;
import java.util.Scanner;

public class boj10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        char[] chars = str.toCharArray();

        for(int i=0;i<chars.length;i++){
            int index = chars[i] - 'a';
            if(arr[index] == -1){
                arr[index] = i;
            }
        }

        for (int num :
                arr) {
            System.out.print(num + " ");
        }
    }
}
