package programmers.lv1;

// 음양 더하기
public class UmYangPlus {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{4,7,12},new boolean[]{true, false, true}));
    }

    private static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for (int i = 0; i < absolutes.length; i++) {
                answer += absolutes[i] * (signs[i] ? 1 : -1 );
            }
            return answer;
        }
    }
}
