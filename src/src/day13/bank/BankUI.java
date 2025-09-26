package src.day13.bank;

import java.util.Scanner;

public class BankUI {
    static Scanner scan = new Scanner(System.in);

    public static void printMenu() {
        System.out.println("""
                -----------------
                [은행이지롱]
                1. 계좌 생성
                2. 입금
                3. 출금
                4. 이체
                5. 전체 출력
                6. 종료
                """);
    }

    public static void selectMenu() {
        System.out.println("메뉴를 선택하세요.");
        int choice = scan.nextInt();
        scan.nextLine();

        while (true) {
            switch (choice) {
                case 1:
                    BankManager.createCustomer();
                    break;
                case 2:
                    BankManager.deposit();
                    break;
                case 3:
                    BankManager.withdraw();
                    break;
                case 4:
                    BankManager.transfer();
                    break;
                case 5:
                    BankManager.printAll();
                    break;
                case 6:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }

    }
}
