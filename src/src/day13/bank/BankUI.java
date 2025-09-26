package src.day13.bank;

import java.util.Scanner;

public class BankUI {
    // 입출력문을 관리하는 함수

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

    public int selectMenu() {
            System.out.println("메뉴를 선택하세요.");
            int choice = scan.nextInt();
            scan.nextLine();
            return choice;
    }

    //CreateAccount의 출력문
    public int printMenuofCA() {
        System.out.println("""
                [계좌 생성]
                1. 신규 고객
                2. 기존 고객
                3. 종료
                """);
        int choice = scan.nextInt(); // 반복해서 입력 받기
        scan.nextLine(); // 버퍼 없애기
        return choice;
    }

    public Customer printCC() {
        System.out.println("이름을 입력하세요.");
        String name = scan.nextLine();
        System.out.println("주민번호를 입력하세요.");
        String ssn = scan.nextLine();
        System.out.println("주소를 입력하세요.");
        String address = scan.nextLine();
        return new Customer (name, ssn, address);
    }

    public String searchCustomer() {
        System.out.println("이름을 입력하세요.");
        String name = scan.nextLine();
        return name;
    }

    public long inputAmount() {
        System.out.println("금액을 입력해주세요.");
        long amount = scan.nextInt();
        return amount;
    }

    public String searchAccount() {
        System.out.println("계좌번호를 입력하세요.");
        String accNo = scan.nextLine();
        return accNo;
    }


    public String fromAcc() {
        System.out.println("이체할 계좌의 번호를 입력하세요.");
        String accNo = scan.nextLine();
        return accNo;
    }

    public String targetAcc() {
        System.out.println("이체받을 계좌의 번호를 입력하세요.");
        String accNo = scan.nextLine();
        return accNo;
    }
}
