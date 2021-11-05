package programmers.lv1;

import java.util.*;
import java.util.stream.Collectors;

// 폰켓몬
public class Ponkemon {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3,3,3,2,2,2}));
    }

    private static class Solution {
        public int solution(int[] nums) {
            int select = nums.length / 2;
            Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

            return Math.min(select, set.size());
        }
    }
}
