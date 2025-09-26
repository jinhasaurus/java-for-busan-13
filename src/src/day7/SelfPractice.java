package src.day7;

import java.util.Scanner;

public class SelfPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            printMenu();
            System.out.println("메뉴 선택 : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    BMICalculator1(scan);
                    break;
                case 2:
                    checkLeapyear(scan);
                    break;
                case 3:
                    ageCal(scan);
                    break;
                case 4:
                    basicCal(scan);
                    break;
                case 5:
                    coinCAl(scan);
                    break;
                case 6:
                    batAvr(scan);
                    break;
                case 7:
                    gradeCal(scan);
                    break;
                case 0:
                    System.out.println("계산기를 종료함");
                    return;
                default:
                    System.out.println("잘못된 숫자 입력");
            }
        }
    }

    private static void gradeCal(Scanner scan) {
        System.out.println("점수를 입력하세요.");
        int grade = scan.nextInt();
        if (grade <0 || grade > 100) {
            System.out.println("잘못 입력하셨습니다.");
        } else if (grade >= 90) {
            System.out.println("A등급");
        } else if (grade < 90 && grade >= 80) {
            System.out.println("B등급");
        } else if (grade < 80 && grade >= 70) {
            System.out.println("C등급");
        } else if (grade < 70 && grade >= 60) {
            System.out.println("D등급");
        } else {
            System.out.println("불합격입니다 ㅠㅠ");
        }
    }

    private static void batAvr(Scanner scan) {
        System.out.println("안타수 : ");
        int anta = scan.nextInt();
        System.out.println("타수 : ");
        int tasu = scan.nextInt();
        double tayul = (double)anta / (double)tasu;
        System.out.printf("타율은 %.3f입니다.\n", tayul); // 순서:

    }

    private static void coinCAl(Scanner scan) {
        System.out.println("총액을 입력해주세요.");
        int amount = scan.nextInt();
        int goman = amount/50000;
        int man = (amount%50000)/10000;
        int gosen = (amount%50000)%10000/5000;
        int sen = (amount%50000)%10000%5000/1000;
        int gohyaku = amount%50000%10000%5000%1000/500;
        int hyaku = amount%50000%10000%5000%1000%500/100;
        int gojyuu = amount%50000%10000%5000%1000%500%100/50;
        int jyuu = amount%50000%10000%5000%1000%500%100%50/10;
        System.out.println("오만원권 : "+goman);
        System.out.println("만원권 : "+man);
        System.out.println("오천원권 : "+gosen);
        System.out.println("천원권 : "+sen);
        System.out.println("오백원 : "+gohyaku);
        System.out.println("백원 : "+hyaku);
        System.out.println("오십원 : "+gojyuu);
        System.out.println("십원 : "+jyuu);
        int sum = goman+man+gosen+sen+gohyaku+hyaku+gojyuu+jyuu;
        System.out.println("총 화폐 개수는 "+sum+"개 입니다.");

    }

    private static void BMICalculator1(Scanner scan) {
        System.out.println("키 : ");
        float height = scan.nextInt();
        System.out.println("몸무게 : ");
        float weight = scan.nextInt();
        float heightM = height / 100;
        float bmi = weight / (heightM * heightM);
        if (weight == 0 || height == 0) {
            System.out.println("잘못된 숫자를 입력하셨습니다.");
            return;
        } else if (bmi < 18.5) {
            System.out.println("저체중 & BMI : " + bmi);
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("표준 & BMI : " + bmi);
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("과체중 & BMI : " + bmi);
        } else if (bmi >= 30) {
            System.out.println("비만 & BMI : " + bmi);
        }
    }

    private static void checkLeapyear(Scanner scan) {
        System.out.println("연도 입력 : ");
        int kotosi = scan.nextInt();
        if (kotosi % 400 == 0) {
            System.out.println("윤년입니다.");
        } else if (kotosi % 100 == 0) {
            System.out.println("평년입니다.");
        } else if (kotosi % 4 == 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("평년입니다.");
        }
    }

    private static void ageCal(Scanner scan) {
        System.out.println("태어난 연도 : ");
        int birth = scan.nextInt();
        System.out.println("현재 연도 : ");
        int year = scan.nextInt();
        if (birth < year) {
            System.out.println("당신의 만 나이는 " + (year - birth) + "살 입니다.");
        } else {
            System.out.println("현재 연도가 태어난 연도보다 커야 합니다.");
        }
    }

    private static void basicCal(Scanner scan) {
        System.out.println("첫 번째 숫자 : ");
        int first = scan.nextInt();
        System.out.println("두 번째 숫자 : ");
        int second = scan.nextInt();
        System.out.println("연산 기호 입력(+, -, *, /) : ");
        scan.nextLine();

        char which = scan.nextLine().charAt(0);
        if (which == '+') {
            System.out.println(first + "+" + second + "=" + (first + second));
        } else if (which == '-') {
            System.out.println(first + "-" + second + "=" + (first - second));
        } else if (which == '*') {
            System.out.println(first + "*" + second + "=" + (first * second));
        } else if (which == '/') {
            System.out.println(first + "/" + second + "=" + (first / second));
        }

    }

    public static void printMenu() {
        System.out.println("===다기능 계산기===");
        System.out.println("1. BMI 계산기");
        System.out.println("2. 윤년 계산기");
        System.out.println("3. 나이 계산기");
        System.out.println("4. 사칙연산 계산기");
        System.out.println("5. 화폐 계산기");
        System.out.println("6. 타율 계산기");
        System.out.println("7. 성적 리포트");
        System.out.println("0. 종료");
    }
}
