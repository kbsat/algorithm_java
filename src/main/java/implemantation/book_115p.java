package implemantation;

import java.util.Arrays;
import java.util.Scanner;

// 왕실의 나이트
public class book_115p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] now = input.split("");

        int[][] toGo = new int[][]{
                {2, 1}, {2, -1}, {-2, +1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}
        };

        int[] nowPos = new int[2];
        int[] nextPos = new int[2];
        int result = 0;
        nowPos[0] = Integer.parseInt(now[1]);
        nowPos[1] = now[0].charAt(0) - 'a' + 1;

        for (int[] toGoNow : toGo) {
            nextPos[0] = toGoNow[0] + nowPos[0];
            nextPos[1] = toGoNow[1] + nowPos[1];

            if (nextPos[0] >= 1 && nextPos[0] <= 8 && nextPos[1] >= 1 && nextPos[1] <= 8) {
                result += 1;
            }

        }

        System.out.println(result);

    }
}
