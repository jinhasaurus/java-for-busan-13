package src.day8;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("원화 총액을 입력해주세요.");
        Scanner scan = new Scanner(System.in);
        int won = scan.nextInt();
        float dollar = (float)won/1350;
        System.out.printf("%d원은 %.3f달러입니다.", won, dollar);

    }
}
