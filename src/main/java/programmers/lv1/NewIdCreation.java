package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 신규 아이디 추천
public class NewIdCreation {
    public static void main(String[] args) {

//        아이디 길이는 3자 이상 15자 이하
//        알파벳 소문자, 숫자, 빼기, 밑줄, 마침표만 가능
//        단 마침표는 처음과 끝에 사용할 수 없으며 연속으로 사용할 수 없다

        String answer = Solution.solution("...!@BaT#*.---.y.abcdefghijklm");
        System.out.println(answer);
    }

    private static class Solution {
        public static String solution(String new_id) {

            new_id = new_id.toLowerCase();
            new_id = new_id.replaceAll("[^0-9a-z._-]", "");
            new_id = new_id.replaceAll("[.]{2,}", ".");
            new_id = new_id.replaceAll("^[.]|[.]$", "");
            new_id = new_id.isEmpty() ? "a" : new_id;
            new_id = new_id.length() >= 16 ? new_id.substring(0, 15).replaceAll("[.]$", "") : new_id;
            if (new_id.length() <= 2) {
                char c = new_id.charAt(new_id.length() - 1);
                StringBuilder new_idBuilder = new StringBuilder(new_id);
                while (new_idBuilder.length() < 3) {
                    new_idBuilder.append(c);
                }
                new_id = new_idBuilder.toString();
            }


            System.out.println(new_id);

            return new_id;
        }
    }
}

