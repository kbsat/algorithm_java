package programmers.lv1;

// 숫자 문자열과 영단어
public class numStrAndWords {

    public static void main(String[] args) {
        Solution.solution("23four5six7");
    }

    private static class Solution {
        public static int solution(String s) {
            s = s.replaceAll("zero", "0");
            s = s.replaceAll("one", "1");
            s = s.replaceAll("two", "2");
            s = s.replaceAll("three", "3");
            s = s.replaceAll("four", "4");
            s = s.replaceAll("five", "5");
            s = s.replaceAll("six", "6");
            s = s.replaceAll("seven", "7");
            s = s.replaceAll("eight", "8");
            s = s.replaceAll("nine", "9");

//            System.out.println(s);
            int answer = Integer.parseInt(s);
            return answer;
        }
    }
}
