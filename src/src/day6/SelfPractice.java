package src.day6;

import java.util.Scanner;

public class SelfPractice {
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }

        Scanner scan = new Scanner(System.in);
        int index=1;
        int sum=1;
        int a;
        while (true) {
            System.out.println("숫자를 입력하세여");
            a = scan.nextInt();
            if (a >=1) {
                System.out.println("숫자를 입력하세여");
                a = scan.nextInt();
                sum += a;
            } else if (a==0) {
                System.out.println(sum);
                System.out.println("프로그램 종료");
                break;
            }
        }



    }
}
