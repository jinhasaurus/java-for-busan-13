package src.day5;

import java.util.Scanner;

public class SwitchCase4 {
    public static void main(String[] args) {
        /*
         몇 월 달이 며칠까지 있냐
         1, 3, 5, 7, 8, 10, 12 -> 31
         2 -> 28
         4, 6, 9, 11
         */
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                if (month > 12 || month < 1) {
                    System.out.println("없는 달입니다");
                    yield 0;
                } else { // 프로그래머,에디터 입장에서는 else에 들어갈 일이 없다는 거를 안다.
                    System.out.println("알 수 없다");
                }
                yield 0; // 디폴트일 때 무조건 yield를 넣은다...
            }
        };
        if(day != 0)
        {
            System.out.println(month + "월의 날짜는" + day + "일까지 있습니다.");
        } else {

        }
    };
}
