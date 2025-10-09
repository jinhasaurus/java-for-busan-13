package src.selfPractice;

import java.util.Scanner;

public class TextBook3 {
    public static void main(String[] args) {

        //소수 출력하기
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int n = scan.nextInt();

        for (int i = 2; i <= n; i++) {
            int count = 0;

            // i를 2부터 i-1까지 나눠보면서 나누어떨어지는지 확인
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++; // 나누어떨어지면 소수가 아님
                    break;   // 더 검사할 필요 없음
                }
            }

            // count가 0이면 나누어떨어진 적이 없으므로 소수
            if (count == 0) {
                System.out.println(i);
            }
        }


        // 팩토리얼 출력하기
        System.out.println("팩토리얼 계산할 숫자를 입력하세요");
        int j = scan.nextInt();
        int pac = 1;

        for (int i = 1; i <= j; i++) {
            pac = pac * i;
        }

        System.out.println(j + "팩토리얼은" + pac + "입니다.");

    }
}
