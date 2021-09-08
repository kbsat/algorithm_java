package greedy;

import java.util.Scanner;

// 거스름돈
public class book_87p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int money = Integer.parseInt(str);

        bookSolution(money);
    }

    public static int solution(int money){
        // 500원 -> 100원 -> 50원 -> 10원 순으로 거슬러줘야함
        int won500Num;
        int won100Num;
        int won50Num;
        int won10Num;

        won500Num = money / 500;
        money = money % 500;

        won100Num = money / 100;
        money = money % 100;

        won50Num = money / 50;
        money = money % 50;

        won10Num = money / 10;
        money = money % 10;

        System.out.println("500원: " + won500Num);
        System.out.println("100원: " + won100Num);
        System.out.println("50원: " + won50Num);
        System.out.println("10원: " + won10Num);

        int count = won500Num + won100Num + won50Num + won10Num;
        System.out.println("총 동전 개수 : " + count);
        return count;
    }

    public static int bookSolution(int money){
        int[] coinTypes = {500, 100, 50, 10};
        int count = 0;
        for (int coin : coinTypes) {
            count += money / coin;
            money = money % coin;
        }

        System.out.println("총 동전 개수 : " + count);
        return count;

    }
}
