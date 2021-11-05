package programmers.lv2;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(new int[]{2, 6, 8, 14});
        System.out.println(solution);

    }
    private static class Solution {
        private static int lcm(int n1, int n2){
            return n1 * n2 / gcd(n1, n2);
        }

        private static int gcd(int n1, int n2){
            if(n2 == 0) return n1;
            else return gcd(n2, n1 % n2);
        }

        public int solution(int[] arr) {
            int lcm = 0;
            for (int i = 0; i < arr.length -1; i++) {
                if(i == 0){
                    lcm = lcm(arr[i], arr[i + 1]);
                }else{
                    lcm = lcm(lcm, arr[i+1]);
                }
            }
            return lcm;
        }

    }
}
