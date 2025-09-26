package src.day3;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        /*
        예제. 금액을 입력받아 최소 화폐 개수를 구한다.
        금액 : 67340
        50000원 : 1
        10000원 : 1
        5000원 : 1
        1000원 : 2
        500원 : 0
        100원 : 3
        50원 : 0
        10원 : 4
        67340원은 총 12개의 화폐가 필요함
         */
        Scanner scan = new Scanner(System.in);
        int price = scan.nextInt();
        int fifth = price/50000;
        int tenth = price%50000/10000;
        int fivth = price%50000%10000/5000;
        int thou = price%50000%10000%5000/1000;
        int fivhu = price%50000%10000%5000%1000/500;
        int hund = price%50000%10000%5000%1000%500/100;
        int fifty = price%50000%10000%5000%1000%500%100/50;
        int ten = price%50000%10000%5000%1000%500%100%50/10;
        System.out.println("금액 : "+price+"\n 50000원 : "+fifth+"\n 10000원 : "+tenth+"\n 5000원 : "+fivth+"\n 1000원 : "+thou+"\n 500원 : "+fivhu+"\n 100원 : "+hund+"\n 50원 : "+fifty+"\n 10원 : "+ten+"\n");
        int sum = fifth+tenth+fivth+thou+fivhu+hund+fifty+ten;
        System.out.println(price+"원은 총 "+sum+"개의 화폐가 필요함");


        /*
        main
        import java.util.Scanner
        Scanner input = new Scanner(System.in)
        int initialValue, price;
        int m5, m1, c5, c1, b5, b1, s5, s1;
        int count = 0;
        System.out.println("금액 : ");
        price = input.nextInt();
        m5 = price/50000;
        count += m5;
        ++ 재대입하면 개꿀임
        price %= 50000;
        m1 = price/10000;
        count += m1;
        price %=10000;
        c5 = ~~~~


         */

    }
}
