package src.day7;

// 숙제!! 각각의 기능 완성해오기.
// yield 까먹엇다!!

import java.util.Scanner;
// void일 때는 return 없다..

public class MultiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            printMenu();
            System.out.println("메뉴 선택 : ");
            int choice = input.nextInt();
            switch (choice) { // choice 값이
                case 1: // case 값이랑 일치할 때 >> 타입이 같아야 함
                    BMICal(input); // 수행문 아니고 값이 될 수 있도록 만들어줄 수 있다. >> 스위치 케이스 자체를 대입하기;
                    break; // 콜론 쓰면 break 계속 해줘야 함
                case 2:
                    checkLeapYear(input);
                    break;
                case 3:
                    calaculatorAge(input);
                    break;
                case 4:
                    basicArithmetic(input);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return; // 리턴이 위치한 해당 함수를 종료함.
                default:
                    System.out.println("잘못 입력하셨습니다;; 다시 선택하세여 ㅡㅡ");
            }
        }
    }

    //메뉴 프린트
    public static void printMenu() {
        System.out.println("===다기능 계산기===");
        System.out.println("1. BMI 계산기");
        System.out.println("2. 윤년 계산기");
        System.out.println("3. 나이 계산기");
        System.out.println("4. 사칙연산 계산기");
        System.out.println("0. 종료");
    }

    // 사칙 연산기
    private static void basicArithmetic(Scanner input) {
        System.out.println("사칙 연산기가 실행되었습니다.");
        System.out.println("첫 번째 수를 입력해주세요.");
        int first = input.nextInt();
        System.out.println("두 번째 수를 입력해주세요.");
        int second = input.nextInt();

        input.nextLine(); // 함 전환해주는 거?
        System.out.println("연산 기호를 입력해주세요 : x, -, *, /");
        char which = input.nextLine().charAt(0);
        if (which == '+') {
            System.out.println(first + "+" + second + "=" + (first + second));
        } else if (which == '-') {
            System.out.println(first + "-" + second + "=" + (first - second));
        } else if (which == '*') {
            System.out.println(first + "*" + second + "=" + (first * second));
        } else if (which == '%') {
            System.out.println(first + "%" + second + "=" + (first / second));
        }
    }


    // 나이 계산기
    private static void calaculatorAge(Scanner input) {
        System.out.println("나이 계산기가 실행되었습니다.");
        System.out.println("태어난 연도를 입력해주세요");
        int birth = input.nextInt();
        System.out.println("현재 연도를 알려주세요.");
        int year = input.nextInt();
        if (year < birth) {
            System.out.println("현재 연도는 태어난 연도보다 커야 합니다.");
        } else {
            System.out.println("당신의 현재 만 나이는 " + (year - birth) + "살 입니다.");
        }
    }


    // 윤년 계산기
    private static void checkLeapYear(Scanner input) {
        System.out.println("윤년 계산기가 실행되었습니다.");
        System.out.println("연도를 입력해주세요.");
        int year = input.nextInt();
        if (year % 400 == 0) {
            if (year % 100 == 0) {
                System.out.println("해당 연도는 평년입니다.");
            }
        } else if (year % 4 == 0) {
            System.out.println("해당 연도는 윤년입니다.");
        } else {
            System.out.println("해당 연도는 평년입니다.");
        }
    }


    // BMI 계산기
    public static void BMICal(Scanner input) {
        System.out.println("BMI 계산기가 실행되었습니다.");
        // 입력받기
        System.out.println("몸무게(kg)를 입력하세요.");
        int weight = input.nextInt();
        System.out.println("키(cm)를 입력하세요.");
        int height = input.nextInt();

        // 계산하기
        double heightM = height / 100.0;
        double BMI = weight / (heightM * heightM);

        // 출력하기
        if (weight == 0 || height == 0) {
            System.out.println("입력 오류");
        } else if (BMI < 18.5) {
            System.out.println("저체중" + BMI);
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("표준" + BMI);
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("과체중" + BMI);
        } else {
            System.out.println("비만" + BMI);
        }
    }
}