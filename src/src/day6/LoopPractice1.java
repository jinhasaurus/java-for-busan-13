package src.day6;
/*
정수 두 개를 입력받아 시작값과 끝값으로서 "start~end의 합계는 sum이다"를 출력하세요.
끝값이 시작값보다 작게 입력하면 "end부터 start까지의 합계는 sum이다" 출력되게 하세요.
 */

import java.util.Scanner;

// 풀이
/*
정수 두 개가 필요함
합계를 저장할 변수가 필요함
입력을 받을 수 있어야 함
정수 두 개의 사이값을 확인하기 위해서 반복문을 사용해야 함
반복문 내에서 할 것 : 누산
 */

public class LoopPractice1 {
    public static void main(String[] args) {
        System.out.println("start값을 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        System.out.println("end값을 입력하세요.");
        int e = scan.nextInt();

        int sum = 0;

        // 뒤에 재대입해야 할 경우 윗줄 temp(temporary)정수 만들어서 a의 값을 저장해두기.
        // s보다 e가 작을 경우!!
        int temp;
        if (s > e) {
            temp = s;
            s = e;
            e = temp;
            System.out.println("입력받은 정수 시작값" + s + "끝값" + e);
        }
        for (int i = s; i <= e; i++) {
            sum += i;

        }
        System.out.println(s + "~" + e + "의 합계는 " + sum + "이다.");

        /*
        추가 예시
        if (s<e) {
        for (int i = s; s<= e; i++) {
            sum = s+1;
            } 그리고 sout으로 출력
        } else {
            for (int i = s; s> e; i++)
                sum = sum +1;
                } 그리고 sout으로 출력
         */

        /* for (; s <= e; s++) {
            sum += s;
        } // break 안 해도 댐!!!

        /* 내 답변 ㅜㅜ
        if (s <= e) {
            for (; s <= e; ) {
                s += s;
                s++;
                sum = s;
                System.out.println();
                break;
            }
        } else {
            for (; s >= e; ) {
                s++;
                sum = s;
                System.out.println("end~start의 합계는" + sum + "이다.");
                break;
            }
            }
         */

    }
}