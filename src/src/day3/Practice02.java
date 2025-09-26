package src.day3;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        예제. 초 단위의 숫자를 입력받아 시간, 분, 초 단위로 환산한다.

        초 단위를 입력하세요 : 3606
        1시간 0분 6초
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("초 단위를 입력하세요 :");
        int sec = scan.nextInt();
        int hour = sec/60/60;
        int min = hour/60;
        int secPrt = sec%60%60;
        System.out.println(hour+"시간 "+min+"분 "+secPrt+"초");



    }
}
