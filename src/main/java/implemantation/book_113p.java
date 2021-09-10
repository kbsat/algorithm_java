package implemantation;

import java.util.Scanner;

// 시각
public class book_113p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int hour = 0; hour <= N; hour++) {
            if(String.valueOf(hour).contains("3")){
                result += 3600;
                continue;
            }
            for (int min = 0; min <= 59; min++) {
                if (String.valueOf(min).contains("3")) {
                    result += 60;
                    continue;
                }
                for (int sec = 0; sec <= 59; sec++) {
                    if(String.valueOf(sec).contains("3")){
                        result += 1;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
