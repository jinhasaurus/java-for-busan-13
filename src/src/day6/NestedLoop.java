package src.day6;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "번째 반복 내에서 반복을 더하는 중 " + j + "번째 반복");
            }
        }


        /* 구구단 출력하ㅣㄱ..
         */
        //샘 답변.................
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
            System.out.println("-----------------");
        }

        /* for (int i = 2 ; i<10 ; i++)
            for (int j=1; j<10 ; j++)
                System.out.print(i+"X"+j+"="+i*j+"  ");

         */

        // 가로로 출력하기.......
        for (int i = 1; i < 10; i++) {
            System.out.println("");
            for (int j = 2; j < 10; j++) {
                System.out.print(j + "X" + i + "=" + i * j + "  ");
                // System.out.printf("%d * %d = ", i, j); >> 이쁘게 출력
            }
        }

        /*for (int i = 2; i<10 ; i++) {
            for (int one = 1, temp1=1, sum1=0; one < 10 ; ) {
                System.out.println(temp1+"x"+one+"="+sum1);
                sum1 = temp1 * one;
                one++;
            }
        }

         */

        gugudan(8);

        Scanner input = new Scanner(System.in);
        System.out.println("출력할 단수를 입력하세요.");
        int danNum = input.nextInt();
        gugudan(danNum);


    }

    public static void gugudan(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.println(i + "X" + j + "=" + i * j);
        }
    }
}
