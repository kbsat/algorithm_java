package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// K번째 수
public class Knum {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] solution = s.solution(new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println(Arrays.toString(solution));

    }

    private static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            for (int i = 0 ; i< commands.length; i++){
                int startIdx = commands[i][0];
                int endIdx = commands[i][1];
                int selectIdx = commands[i][2];
                int total = endIdx - startIdx + 1;

                int[] temp = new int[total];
                for(int j = 0; j < total; j++){
                    temp[j] = array[j + startIdx - 1];
                }

                Arrays.sort(temp);

                answer[i] = temp[selectIdx - 1];
            }
            return answer;
        }
    }
}
