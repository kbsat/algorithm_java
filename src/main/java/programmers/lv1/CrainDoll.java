package programmers.lv1;

import codingtest.kakao2022.Solution;

import java.util.Stack;

// 크레인 인형뽑기 게임
public class CrainDoll {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4});
        System.out.println(solution);
    }

//    [[0,0,0,0,0],
//    [0,0,1,0,3],
//    [0,2,5,0,1],
//    [4,2,4,4,2],
//    [3,5,1,3,1]]
    private static class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            boolean isInsert = false;
            Stack<Integer> stack = new Stack<>();

            for (int move : moves) {
//                System.out.println(move);
                Integer top = -1;
                if(!stack.empty()){
                    top = stack.peek();
                }
                for (int j = 0; j < board.length; j++) {
                    if (board[j][move - 1] != 0) {
                        stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        if(top.equals(stack.peek())){
                            stack.pop();
                            stack.pop();
                            answer += 2;
                        }
                        break;
                    }
                }
            }
            return answer;
        }

    }
}
