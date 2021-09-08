package implemantation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 단어공부
public class boj1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String strUpperCase = str.toUpperCase();

//        System.out.println(strUpperCase);
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = strUpperCase.toCharArray();
        for (char charOne : chars) {
            if (map.get(charOne) == null) {
                map.put(charOne, 1);
            }else{
                Integer nowNum = map.get(charOne);
                map.replace(charOne,nowNum+1);
            }
        }

        Character maxChar = '?';
        int maxNum = 0;
        for (Map.Entry<Character, Integer> mapOne : map.entrySet()) {
            Character key = mapOne.getKey();
            int value = mapOne.getValue();

            if(value > maxNum){
                maxChar = key;
                maxNum = value;
            }else if(value == maxNum){
                maxChar = '?';
            }
        }
        System.out.println(maxChar);
    }
}
