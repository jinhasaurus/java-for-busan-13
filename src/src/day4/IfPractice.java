package src.day4;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        //시험 점수를 정수로 입력받습니다. (0~100점)
        /*
        합격입니다/불합격입니다 (80점)
       A 90점 이상 B 80점 이상 C 70점 이상 D 60점 이상 F 60점 미만
       범위를 벗어나는 입력치는 "입력 오류" 출력
         */
        System.out.println("시험 점수를 입력해주세요");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("입력 오류");
        } else if (score >= 80) {
            System.out.println("합격입니다 추카추카");
        } else {
            System.out.println("불합격입니다 ㅠㅠ");
        }
        if (score >= 90) {
            System.out.println("등급은 A입니다");
        } else if (score >= 80 && score < 90) {
            System.out.println("등급은 B입니다");
        }
                else if (score >= 70 && score < 80) {
            System.out.println("등급은 C입니다");
        }
                else if (score >= 60 && score < 70) {
            System.out.println("등급은 D입니다");
        }
                else if (score < 60) {
            System.out.println("등급은 F입니다");
        }
    }
}

/*
String result = (score > 80) ? "합격" : "불합격"
 */