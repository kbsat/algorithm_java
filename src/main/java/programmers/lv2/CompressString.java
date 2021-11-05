package programmers.lv2;

// 문자열 압축
public class CompressString {
    public static void main(String[] args) {

    }

    private static class Solution {
        public int solution(String s) {
            int answer = s.length();
            int compLen = 0;

            for (int i = 1; i <= s.length() / 2; i++) {
                int count = 1;
                String prev = s.substring(0, i);
                String comp = "";

                for (int j = i; j <= s.length() + i; j += i) {
                    String nowStr;

                    if (j >= s.length()) {
                        nowStr = "";
                    } else if (j + i > s.length()){
                        nowStr = s.substring(j);
                    } else{
                        nowStr = s.substring(j, j + i);
                    }

                    if(nowStr.equals(prev)){
                        count ++;
                    }else if( count >= 2){
                        comp += count + prev;
                        count = 1;
                    }else{
                        comp += prev;
                    }
                    prev = nowStr;
                }
                compLen = comp.length();
                answer = Math.min(compLen, answer);
            }
            return answer;
        }
    }
}
