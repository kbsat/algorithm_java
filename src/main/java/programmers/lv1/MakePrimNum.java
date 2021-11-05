package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

// 소수 만들기
public class MakePrimNum {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 7, 6, 4}));
    }

    private static class Solution {

        public int solution(int[] nums) {
            int answer = 0;
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (isPrime(nums[i] + nums[j] + nums[k])) {
                            answer += 1;
                        }
                    }
                }
            }

            return answer;
        }

        private boolean isPrime(int num) {
            for (int i = 2; i <= (int)Math.sqrt(num); i++) {
                if( num % i == 0 ) return false;
            }

            return true;
        }
    }

}
