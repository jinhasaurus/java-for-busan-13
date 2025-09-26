package src.day4;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        /*
        생년과 올해를 입력받으세요
        생년은 올해보다 이전이어야 합니다
        올바른 값을 입력한 경우에만
        1. "몇 살"인지  출력해주세요
        2. 생년이 짝수해인지 출력
        태어난 해가 홀수이고 올해가 5의 배수가 아니다
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("생년을 입력해주세요");
        int birth = scan.nextInt();
        System.out.println("올해 연도를 알려주세요");
        int year = scan.nextInt();
        if (birth > year) {
            System.out.println("안 태어남");
        }
        if (birth == year || birth > year) {
            System.out.println("입력 오류");
        } else if (birth <= year) {
            System.out.println("당신은 " + (year - birth) + "살입니다.");
        }
        else if (birth % 2 == 0) {
            System.out.println("당신은 짝수해 출생입니다.");
        } else if (year % 5 > 0) {
            System.out.println("당신은 홀수해 출생이고 올해연도는 5의 배수가 아닙니다.");
        } else {
            System.out.println("당신은 홀수해 출생입니다.");
        }

    }
    /* 숙제.....
    태어난 해가 윤년인지 확인하세요
    4년마다 윤년, 100년마다 평년
    단, 400년마다 무조건 윤년
    2001, 1900 평년 / 2004 2000 윤년
     */

}
