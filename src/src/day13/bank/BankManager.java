package src.day13.bank;

import java.util.Scanner;

public class BankManager {
    BankManager() {}
    final int BANK_NO = 1000;
    final int AREA_NO = 1234;

    static Scanner scan = new Scanner(System.in);

    public static void createCustomer() {
        System.out.println("""
                [계좌 생성]
                1. 신규 고객
                2. 기존 고객
                3.종료
                """);
        int choice = scan.nextInt();
        scan.nextLine();

        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("이름을 입력하세요.");
                    String name = scan.nextLine();
                    System.out.println("주민번호를 입력하세요.");
                    String ssn = scan.nextLine();
                    System.out.println("주소를 입력하세요.");
                    String address = scan.nextLine();
                    //Customer c = new Customer(name,ssn,address);
                    // createAccount();
                case 2:
                    System.out.println("이름을 입력하세요");
                    String existname = scan.nextLine();
                    // 검색해서 있으면 거기에 추가하기를 구현해야 함

                case 3:
                    System.out.println("초기 메뉴로 돌아갑니다.");
                    BankUI.printMenu();
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    private static void createAccount(String accNo, Customer c, long balance) {
        // this.c = c;
        // accNo = BANK_NO+"-"+AREA_NO+"-"+(100++);

        // Account a = new Account(accNo,c,balance);
    }

    public static void deposit() {
    }

    public static void withdraw() {
    }

    public static void transfer() {
    }

    public static void printAll() {
    }
}

