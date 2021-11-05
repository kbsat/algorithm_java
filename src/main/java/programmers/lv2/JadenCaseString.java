package programmers.lv2;

public class JadenCaseString {
    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution("hello  3people  me");
        System.out.println(solution);
    }
    private static class Solution {
        public String solution(String s) {
            String answer = "";
            String lowerStr = s.toLowerCase();
            String[] strArr = lowerStr.split(" ");
            if(s.trim().equals("")){
                return s;
            }
            for (String str : strArr){
                String temp;
                if(str.equals("")){
                    temp = "";
                }else{
                    char[] chars = str.toCharArray();
                    if(Character.isLetter(chars[0])){
                        chars[0] = Character.toUpperCase(chars[0]);
                    }

                    temp = new String(chars);
                }
                answer += temp;
                answer += " ";
            }

            if(!s.substring(s.length()-1).equals(" ")){
                answer = answer.trim();
            }
            return answer;
        }
    }
//    public String solution(String s) {
//        String answer = "";
//        String[] sp = s.toLowerCase().split("");
//        boolean flag = true;
//
//        for (String ss : sp) {
//            answer += flag ? ss.toUpperCase() : ss;
//            flag = ss.equals(" ") ? true : false;
//        }
//
//        return answer;
//    }

}
