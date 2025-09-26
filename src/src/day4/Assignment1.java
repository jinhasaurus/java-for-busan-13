package src.day4;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
           /* 숙제.....
    태어난 해가 윤년인지 확인하세요
    1) 4년마다 윤년   (birth %4) == 0
    2) 그리고, 100년마다 평년 (birth %100) == 0 >> 생년이 100의 배수가 아니면 윤년 (birth % 100) != 0
    1)과 2)를 둘 다 만족해야 함
    3) 단, 400년마다 무조건 윤년 (birth % 400) == 0
    2001, 1900 평년 / 2004 2000 윤년
    1) 4로 나누어떨어지는 연도이면 윤년
    2) 4로 나누어떨어지더라도 100으로 나누어떨어지면 평년
    3) 4로 나누어떨어지며, 100으로 나누어떨어져도 400으로 나누어떨어지면 윤년

    if (){if (){}} 일케 쓰면 if만족했을 때 if를 만족하면~ 이런 뜻
    if ((birth % 4) == 0 && (birth % 100) != 0 || (birth % 400) == 0) {
        System.out.println("생년이 윤년입니다.")
    } else {
        System.out.println("생년이 평년입니다.")
        }
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("태어난 해를 입력해주세요.");
        int year = scan.nextInt();
        if (year % 400 == 0) {
            System.out.println("윤년에 태어나셨네요.");
        } else if (year % 100 == 0) {
            System.out.println("평년에 태어나셨네요.");
        } else if (year % 4 == 0) {
            System.out.println("윤년에 태어나셨네요.");
        } else {
            System.out.println("평년에 태어나셨네요.");
        }
    }
}

