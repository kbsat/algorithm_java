package programmers.lv1;

import java.util.*;

// 두개 뽑아서 더하기
public class SelectTwoAndPlus {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] se = s.solution(new int[]{2, 1, 3, 4, 1});
        System.out.println(Arrays.toString(se));
    }

    private static class Solution {
        public int[] solution(int[] numbers) {
            Set<Integer> set = new HashSet<>();
            List<Integer> list = new ArrayList<>();
            int[] answer;

            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    int sum = numbers[i] + numbers[j];
                    set.add(sum);
                }
            }

            answer = new int[set.size()];
            int size = 0;
            for (int num : set) {
                answer[size++] = num;
            }
            Arrays.sort(answer);

            return answer;
        }
    }
}
