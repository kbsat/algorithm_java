package programmers.lv1;

import codingtest.kakao2022.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 완주하지 못한 선수
public class MaratonWanju {
    public static void main(String[] args) {
        Solution s = new Solution();
        String answer = s.solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"});
        System.out.println(answer);

    }

    private static class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String, Integer> map = new HashMap<>();
            for (String player : participant) map.put(player, map.getOrDefault(player, 0) + 1);
            for (String winner : completion) map.put(winner, map.get(winner) - 1);

            for (String key : map.keySet()) {
                if(map.get(key) != 0){
                    answer = key;
                }
            }
            return answer;
        }
    }
}
