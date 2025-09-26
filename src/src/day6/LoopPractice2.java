package src.day6;

import java.util.Scanner;

public class LoopPractice2 {
    public static void main(String[] args) {
        /*
        정수를 입력받아 합계를 구한다
        입력받은 정수가 0이면 무조건 종료한다
        while / do-while / for 세가지 버전으로 만드세여
         */

        /*
        입력 받을 변수
        합계 저장할 변수
        반복해서 출력문 보여주고 나서 입력을 받는다.
         */

        //while 버전
        int index = 1;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 " + index + "입력 : ");
        while (true) {
            int i = scan.nextInt();
            sum += i;
            index++;
            System.out.println("정수 " + index + "입력");
            if (i == 0) {
                System.out.println("합계" + sum);
                break;
            }
        }

        System.out.println("do-while 버전");
        int index2 = 1;
        int sum2 = 0;
        int i2;
        do {
            i2 = scan.nextInt();
            System.out.println("정수 " + index2 + "입력 : ");
            sum2 += i2;
            index2++;
        } while (i2 != 0);
        System.out.println("합계" + sum2);
        // break; >> 얘 멈춰줘야대.........


        System.out.println("for문 버전");
        // for 문 버전
        int index3 = 1;
        int i3 = 0;
        int sum3 = 0;
 // for 문 복습하기
        for (index3 = 0; i3 != 0; index3++) {
            i3 = scan.nextInt();
            System.out.println("정수" + index3 + "입력 :");
            sum3 += i3;
            index3++;
            if (i3 == 0) break;
        }
        System.out.println("합계" + sum3);

    }
}
