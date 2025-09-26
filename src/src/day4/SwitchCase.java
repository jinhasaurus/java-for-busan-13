package src.day4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*
        switch (조건) {
            case 값과 일치하는지 확인할 값1 :
                수행문;
            case 값과 일치하는지 확인할 값2 :
                수행문;
            case 값과 일치하는지 확인할 값3 :
                수행문;
                break;
            default :
                수행문;
        }
        break란? 케이스에 일치하는 경우 수행문을 시행하고 switch-case문을 빠져나가게 함
         */

        int ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("금메달");
                break;
            case 2:
                System.out.println("은메달");
                break;
            case 3:
                System.out.println("동메달");
                break;
            default:
                System.out.println("참가상");

        }
        // switch case로 학점 출력하기. if문 그대로
        //시험 점수를 정수로 입력받습니다. (0~100점)
        /*
        합격입니다/불합격입니다 (80점)
       A 90점 이상 B 80점 이상 C 70점 이상 D 60점 이상 F 60점 미만
       범위를 벗어나는 입력치는 "입력 오류" 출력
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score = scan.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("입력 오류");
        } else if (score >= 80) {
            System.out.println("합격입니다");
        } else {
            System.out.println("불합격입니다");
        }
        int rank = score / 10;
        switch (rank) { // 괄호 안의 값과 케이스 값을 비교해서 일치하면 실행문을 실행.
            case 10:
                System.out.println("A등급");
                break;

            case 9:
                System.out.println("A등급");
                break;

            case 8:
                System.out.println("B등급");
                break;

            case 7:
                System.out.println("C등급");
                break;

            case 6:
                System.out.println("D등급");
                break;

            default:
                System.out.println("F등급");
                // 잘 알아볼 수 있는 코드가 잇다!!!

        }
    }
}

