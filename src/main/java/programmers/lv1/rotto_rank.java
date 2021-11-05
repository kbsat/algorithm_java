package programmers.lv1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 로또의 최고 순위와 최저 순위
public class rotto_rank {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        System.out.println(Arrays.toString(answer));
    }

    private static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {

            List<Integer> lottoList = Arrays.stream(lottos).boxed().collect(Collectors.toList());
            List<Integer> winNumList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
            int zeroNum = (int) lottoList.stream().filter(x -> x.equals(0)).count();

            lottoList.retainAll(winNumList);
            int correctNum = lottoList.size();


            int maxRank = 7 - (correctNum + zeroNum) < 7 ? 7 - (correctNum + zeroNum) : 6;
            int minRank = 7 - correctNum < 7 ? 7 - correctNum : 6;
            int[] answer = new int[]{maxRank, minRank};
            return answer;
        }
    }

}
