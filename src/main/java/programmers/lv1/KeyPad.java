package programmers.lv1;

// 키패드 누르기
public class KeyPad {

    public static void main(String[] args) {
        Solution s = new Solution();
        String result = s.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
        System.out.println(result);
    }

    private static class Solution {
        public String solution(int[] numbers, String hand) {
            StringBuilder answer = new StringBuilder();
            int[] nowHand = new int[]{10, 12};

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                    nowHand[0] = numbers[i];
                    answer.append("L");
                } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                    nowHand[1] = numbers[i];
                    answer.append("R");
                } else {
                    int leftDist = getDistance(numbers[i], nowHand[0]);
                    int rightDist = getDistance(numbers[i], nowHand[1]);

                    if (leftDist < rightDist) {
                        nowHand[0] = numbers[i];
                        answer.append("L");
                    } else if (leftDist > rightDist) {
                        nowHand[1] = numbers[i];
                        answer.append("R");
                    } else {
                        if (hand.equals("left")) {
                            nowHand[0] = numbers[i];
                            answer.append("L");
                        } else if (hand.equals("right")) {
                            nowHand[1] = numbers[i];
                            answer.append("R");
                        }
                    }
                }
            }
            return answer.toString();
        }

        private int getDistance(int number, int now) {
            if (number == 0)
                number = 11;
            if (now == 0)
                now = 11;

            // -3, +3, -1, +1 -> 1칸
            int i = Math.abs(number - now);
            int dist = 0;
            if(i == 0){
                return dist;
            }
            dist ++;

            while (i != 3 && i != 1) {
                if (i >= 3) {
                    i -= 3;
                } else {
                    i -= 1;
                }
                dist += 1;
            }

            return dist;

        }
    }
}
