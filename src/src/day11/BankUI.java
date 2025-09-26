package src.day11;

import java.util.Scanner;

public class BankUI {
    private Scanner input = new Scanner(System.in);

    void printMainMenu (){
        System.out.println("----------------");
        System.out.println("DDD은행에 어서오세여");
        System.out.println("1. 계좌생성");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 이체");
        System.out.println("5. 전체출력");
        System.out.println("6. 종료");
        System.out.println("----------------");

    }

    int selectMenu () {
        System.out.println("메뉴를 선택하세요.");
        int no = input.nextInt();
        return no;
    }

    String inputSsn () {
        System.out.println("주민번호를 입력하세요.");
        String ssn = input.nextLine();
        return ssn;
    }

    public void printCreateAccountOpt() {


    }
}
