package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 없는 숫자 더하기
public class HaveNoNum {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1,2,3,4,6,7,8,0}));
    }
    private static class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
            for (int number : numbers) {
                list.remove((Integer) number);
            }

            for(Integer remainNum : list){
                answer += remainNum;
            }

            return answer;
        }
    }
}
