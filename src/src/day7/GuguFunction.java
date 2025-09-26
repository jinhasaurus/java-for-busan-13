package src.day7;

import java.util.Scanner;

public class GuguFunction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("프로그램 시작");
        System.out.println("출력할 단수를 입력하세요. 0을 입력하면 종료합니다.");
        while (true) {
            int danNum = input.nextInt();
            gugudan(danNum);
        }

    }


    public static void gugudan(int i) {
        for (int j = 1; j < 10; j++) {
            if (i == 0) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println(i + "X" + j + "=" + i * j);

            }
        }
    }
}
