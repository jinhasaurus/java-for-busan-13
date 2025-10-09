package src.selfPractice;

import java.util.Scanner;

public class TextBook2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("층수를 눌러주세요.");

        int floor = scan.nextInt();

        switch (floor) {
            case 1 -> System.out.println("1층 약국입니다");
            case 2 -> System.out.println("2층 정형외과입니다");
            case 3 -> System.out.println("3층 피부과입니다");
            case 4 -> System.out.println("4층 치과입니다");
            case 5 -> System.out.println("5층 헬스클럽입니다");
            default -> System.out.println("없는 층수입니다");
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("안녕하세요" + i);
        }

        //구구단 3단부터 7단까지만 출력하기

        for (int dan = 1; dan <= 9; dan++) {
            if (dan >= 3 && dan <= 7) {
                for (int gop = 1; gop <= 9; gop++) {
                    System.out.println(dan + "*" + gop + "=" + (dan * gop));
                }
            }
        }


    }
}
