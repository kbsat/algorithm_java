package implemantation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 상하좌우
public class book_110p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String planner = sc.nextLine();

        String[] plannerSplit = planner.split(" ");
        Map<String, int[]> goPlan = new HashMap<>();

        goPlan.put("L", new int[]{0, -1});
        goPlan.put("R", new int[]{0, 1});
        goPlan.put("D", new int[]{1, 0});
        goPlan.put("U", new int[]{-1, 0});

        int[] now = new int[]{1, 1};
        int[] after = new int[2];

        for (int i = 0; i < plannerSplit.length; i++) {
            int[] go = goPlan.get(plannerSplit[i]);

            after[0] = now[0] + go[0];
            after[1] = now[1] + go[1];

            if (after[0] > N || after[0] < 1){
                after[0] = now[0];
            }else if(after[1] > N || after[1] < 1){
                after[1] = now[1];
            }

//            now[0] = after[0];
//            now[1] = after[1];
            now = Arrays.copyOf(after, after.length);

        }

        Arrays.stream(now).forEach(s -> System.out.print(s + " "));

    }
}
