package class2;

import java.util.Scanner;

public class boj10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        for (int i = 0; i < testNum; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int step = n / h + 1;
            int floor = n % h;
            if(floor == 0) {
                floor = h;
            }
            if(n % h == 0){
                step -= 1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(floor);
            if(step < 10){
                sb.append(0);
            }
            sb.append(step);

            System.out.println(sb);
        }
    }
}
