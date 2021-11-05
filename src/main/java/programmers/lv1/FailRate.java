package programmers.lv1;

import java.util.*;
import java.util.stream.Collectors;

// 실패율
public class FailRate {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(4, new int[]{4,4,4,4,4})));
    }

    // 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
    public static class Rate implements Comparable<Rate> {
        int idx;
        float rate;

        public Rate(int idx, float rate) {
            this.idx = idx;
            this.rate = rate;
        }

        @Override
        public int compareTo(Rate o) {
            return Float.compare(o.rate, this.rate);
        }
    }

    private static class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            List<Rate> rateList = new ArrayList<>();
            int remainNum = stages.length; // 남아있는 사람 수
            float failRate = 0;

            for (int n = 1; n <= N; n++) {
                int failNum = 0; // 해당 스테이지에서 실패한 사람 수
                for (int stage : stages) {
                    if (stage == n) {
                        failNum += 1;
                    }
                }
                if(remainNum == 0){
                    failRate = 0;
                }else{
                    failRate = failNum / (float) remainNum;
                }

                remainNum -= failNum;

                rateList.add(new Rate(n,failRate));
            }

            Collections.sort(rateList);

            for (int i = 0; i < answer.length; i++) {
                answer[i] = rateList.get(i).idx;
            }
            return answer;
        }
    }
}
