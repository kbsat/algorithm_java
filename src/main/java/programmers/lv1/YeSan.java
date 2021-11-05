package programmers.lv1;

import java.util.Arrays;

// 예산
public class YeSan {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1,3,2,5,4}, 9));
    }
    private static class Solution {
        public int solution(int[] d, int budget) {
            Arrays.sort(d);
            int sum = 0;
            int num = 0;
            for (int i = 0; i < d.length; i++) {
                if(sum + d[i] <= budget){
                    sum += d[i];
                    num ++;
                }else{
                    break;
                }
            }

            return num;
        }
    }
}
