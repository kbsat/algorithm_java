package programmers.lv1;

// 2016년
public class year2016 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution(5, 24);
        System.out.println(solution);
    }

    private static class Solution {
        private final int[] daysNum = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        private final String[] weeks = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        public String solution(int a, int b) {

            int sum = 0;
            for (int i = 1; i < a; i++) {
                sum += daysNum[i];
            }
            sum += b-1;

            return weeks[sum % 7];

        }
    }
}
