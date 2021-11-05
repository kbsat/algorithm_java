package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 체육복
public class GymUniform {

    public static void main(String[] args) {
        Solution s = new Solution();
        int answer = s.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        System.out.println(answer);

    }

    private static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            // 체육복 현황 정리
            int[] arr = new int[n];
            Arrays.fill(arr, 1);
            for (int i = 0; i < lost.length; i++) {
                arr[lost[i] - 1] -= 1;
            }
            for (int i = 0; i < reserve.length; i++) {
                arr[reserve[i] - 1] += 1;
            }
            Arrays.sort(lost);

            // 체육복 나눠주기
            for (int i = 0; i < lost.length; i++) {
                if (arr[lost[i] - 1] == 0) {
                    if (lost[i] - 1 >= 1 && lost[i] - 1 < n - 1) {
                        // 앞뒤로 확인
                        if (arr[lost[i] - 2] >= 2) {
                            arr[lost[i] - 2] -= 1;
                            arr[lost[i] - 1] += 1;
                        } else if (arr[lost[i]] >= 2) {
                            arr[lost[i]] -= 1;
                            arr[lost[i] - 1] += 1;
                        }
                    } else if (lost[i] - 1 == 0 && arr[lost[i]] >= 2) {
                        // 뒤만 확인
                        arr[lost[i]] -= 1;
                        arr[lost[i] - 1] += 1;
                    } else if (lost[i] - 1 == n - 1 && arr[lost[i] - 2] >= 2) {
                        // 앞만 확인
                        arr[lost[i] - 2] -= 1;
                        arr[lost[i] - 1] += 1;
                    }
                }
            }

            long count = Arrays.stream(arr).filter(s -> s >= 1).count();
            return (int) count;
        }
    }

}
