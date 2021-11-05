package programmers.lv1;

import codingtest.kakao2022.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 모의고사
public class MockExam {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(new int[]{1,3,2,4,2});
        System.out.println(Arrays.toString(result));
    }

    private static class Solution {
        public int[] solution(int[] answers) {
            int[][] check = new int[][]{
                    {1, 2, 3, 4, 5},
                    {2, 1, 2, 3, 2, 4, 2, 5},
                    {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
            int[] correctNum = new int[]{0, 0, 0};

            for (int i = 0; i < answers.length; i++) {
                for (int j = 0; j < check.length; j++) {
                    if (answers[i] == check[j][i % check[j].length]) {
                        correctNum[j] += 1;
                    }
                }
            }

            int maxNum = Arrays.stream(correctNum).max().getAsInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i<correctNum.length;i++){
                if (correctNum[i] == maxNum) {
                    list.add(i + 1);
                }
            }
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
