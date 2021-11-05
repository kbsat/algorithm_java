package programmers.lv1;

// 약수의 개수와 덧셈
public class YaksuNumPlus {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(13, 17);
        System.out.println(solution);
    }

    private static class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            int sum = 0;
            for (int i = left; i <= right; i++) {
                int num = 0;
                for (int j = 1; j <= i; j++) {
                    if(i % j == 0){
                        num += 1;
                    }
                }

                if(num % 2 == 0){
                    sum += i;
                }else{
                    sum -= i;
                }
            }
            return sum;
        }
    }
}
