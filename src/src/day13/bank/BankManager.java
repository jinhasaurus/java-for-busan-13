package src.day13.bank;

import java.util.Scanner;

public class BankManager {
    BankManager() {
    }

    static final int BANK_NO = 1000;
    static final int AREA_NO = 1234;
    static int CUS_NO = 100;

    static Scanner scan = new Scanner(System.in);

    public static void CreateCustomer() {
        while (true) {
            BankUI.printMenuofCC(); // 메뉴 출력
            int choice = scan.nextInt(); // 반복해서 입력 받기
            scan.nextLine(); // 버퍼 없애기

            switch (choice) {
                case 1:
                    getNewCustomer();
                    createAccount();
                    break;
                case 2:
                    // 기존고객 아직 구현 안 함
                    // System.out.println("이름을 입력하세요");
                    break;
                case 3:
                    System.out.println("초기 메뉴로 돌아갑니다.");
                    BankUI.printMenu();
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    // 신규 고객 등록
    private static Customer getNewCustomer() {
        System.out.println("이름을 입력하세요.");
        String name = scan.nextLine();
        System.out.println("주민번호를 입력하세요.");
        String ssn = scan.nextLine();
        System.out.println("주소를 입력하세요.");
        String address = scan.nextLine();
        Customer c = new Customer(name, ssn, address);
        return c;
    }

    // 신규 계좌 개설
    private static void createAccount() {
        String accNo = BANK_NO + "-" + AREA_NO + "-" + (CUS_NO++);
        Account a = new Account();
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
