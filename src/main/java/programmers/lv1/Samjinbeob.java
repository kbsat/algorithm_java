package programmers.lv1;

import java.util.Arrays;

// 3진법 뒤집기
public class Samjinbeob {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(45);
        System.out.println(solution);
    }

    private static class Solution {
        public int solution(int n) {
            int answer = 0;
            StringBuilder sb = new StringBuilder();

            while (n >= 3) {
                sb.append(n % 3);
                n /= 3;
            }
            sb.append(n);

            String num = sb.toString();
            int sum = 0;
            char[] numChars = num.toCharArray();
            for (int i = num.length() - 1; i >= 0; i--) {
                int nowNum = numChars[i] - '0';
                int toDecimal = (int) (nowNum * Math.pow(3, num.length() - 1 - i));
                sum += toDecimal;
            }
            return sum;
        }
    }
}
