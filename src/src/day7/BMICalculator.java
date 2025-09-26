package src.day7;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BMICal(input);

    }

    public static void BMICal(Scanner sc) { // Scanner 타입도 가져올 수 잇다!!

        // 입력받기
        System.out.println("몸무게(kg)를 입력하세요.");
        int weight = sc.nextInt();
        System.out.println("키(cm)를 입력하세요.");
        int height = sc.nextInt();

        // 계산하기
        double heightM = height / 100.0;
        double BMI = weight / (heightM * heightM);

        // 출력하기
        if (weight == 0 || height == 0) {
            System.out.println("입력 오류");
        } else if (BMI < 18.5) {
            System.out.println("저체중"+BMI);
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("표준"+BMI);
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("과체중"+BMI);
        } else {
            System.out.println("비만"+BMI);
        }

    }


//    public static void main(String[] args) {
//        System.out.println("몸무게를 입력하세요.");
//        Scanner input = new Scanner(System.in);
//        int height = input.nextInt();
//        System.out.println("키를 입력하세요.");
//        int weight = input.nextInt();
//        Calculator(height,weight);
//
//    }
//
//    public static void Calculator (int height,weight) {
//        int BMI = weight /(height*height);
//        if (BMI < 18.5) {
//            System.out.println("저체중");
//        } else if (BMI >= 18.5 && BMI <= 24.9) {
//            System.out.println("표준");
//        } else if (BMI >= 25.0 && BMI <= 29.9) {
//            System.out.println("과체중");
//        } else {
//            System.out.println("비만");
//        }
//
//    }
}
