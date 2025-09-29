package src.day13.bank;

import java.util.ArrayList;

public class BankManager {
    // 입출력 받는 BankUI 호출
    BankUI ui = new BankUI();

    // 은행고유번호 & 지역고유번호 지정
    static final int BANK_NO = 1000; // 은행고유번호이므로 상수 선언
    static final int AREA_NO = 1234; // 지역고유번호이므로 상수 선언

    // 고객리스트 생성
    private ArrayList<Customer> customerList = new ArrayList<>();

    // 계좌 생성 관리
    public void selectAccountType() {
        int choice = ui.printMenuofCA(); // 메뉴 출력
        switch (choice) {
            case 1: // 신규 고객 만들고 신규 계좌 만들기
            {
                Customer c = createCustomer();
                Account a = createAccountForCustomer(c);
                System.out.println("신규 고객 계좌가 생성되었습니다. 계좌 번호 : " + a.getAccNo());
                break;
            }
            case 2: // 기존 고객 불러와서 신규 계좌 만들기
                if (hasAnyAccount()) {
                    Customer c = selectExistingCustomer();
                    if (c != null) {
                        Account a = createAccountForCustomer(c); // Customer에 계좌 추가
                        System.out.println("기존 고객의 새 계좌가 생성되었습니다. 계좌번호 : " + a.getAccNo());
                    }
                    break;
                } else {
                    System.out.println("현재 계좌가 없습니다. 먼저 계좌를 생성해주세요.");
                    break; // 메뉴로 돌아가기
                }

            case 3: // 초기 메뉴 돌아가기
                System.out.println("초기 메뉴로 돌아갑니다.");
                BankUI.printMenu();
                return;
            default: // 잘못 입력
                System.out.println("잘못 입력하셨습니다.");
        }
    }


    // 기존고객 검색하기
    private Customer selectExistingCustomer() {
        String name = ui.searchCustomer(); // UI에서 이름 입력
        for (int i = 0; i < customerList.size(); i++) {
            Customer c = customerList.get(i);
            // 이름 비교 (toString()이 name 반환한다고 가정)
            if (c.name.equals(name)) {
                return c;
            }
        }
        // 못 찾은 경우
        System.out.println("그런 고객 없음");
        return null;
    }

    // 신규 고객 등록
    private Customer createCustomer() {
        Customer c = ui.printCC();
        customerList.add(c);
        return c;
    }

    // 고객에게 계좌 생성해주기
    private Account createAccountForCustomer(Customer c) {
        String accNo = AccountIDGenerator.generate();
        Account a = new Account(accNo, 0);
        c.addAccount(a);
        return a;
    }

    // 입금하기
    public void deposit(Account a, long amount) {
        if (amount <= 0) {
            System.out.println("입금액은 0원보다 커야 합니다.");
            return;
        }
        a.setBalance(a.getBalance() + amount); // balance를 안전하게 수정
        System.out.println(a.getAccNo() + " 계좌에 " + amount + "원이 입금되었습니다.");
        System.out.println("잔액 = "+a.getBalance());
    }

    //출금하기
    public void withdraw(Account a, long amount) {
        if (amount <= 0) {
            System.out.println("출금액은 0원보다 커야 합니다.");
        } else if (a.getBalance() - amount < 0) {
            System.out.println("출금액이 잔액보다 큽니다.");
        } else {
            a.setBalance(a.getBalance() - amount);
            System.out.println(amount + "원이 출금되었습니다.");
            System.out.println("잔액 = "+a.getBalance());
        }
    }

    // 이체하기
    public void transfer(Account a, Account target, long amount) {
        if (amount <= 0) {
            System.out.println("0원 이하 금액은 이체할 수 없습니다.");
        } else if (amount > a.getBalance()) {
            System.out.println("출금 금액이 잔액보다 큽니다.");
        } else {
            a.setBalance(a.getBalance() - amount);
            target.setBalance(target.getBalance() + amount);
            System.out.println(amount + "원 이체되었습니다.");
            System.out.println("잔액 = "+target.getBalance());
        }
    }

    // 전체 출력
    public void printAll() {
        System.out.println("전체 고객 목록");
        for (Customer c : customerList) {
            System.out.println("-----------------------");
            System.out.println("이름 : " + c.getName());
            for (Account a : c.getAccountList()) {
                System.out.println("계좌번호 : " + a.getAccNo());
                System.out.println("잔액 : " + a.getBalance());
            }
            System.out.println("-----------------------");
        }
    }

    // 계좌 조회하기
    public Account selectAccount() {
        while (true) { // 못 찾으면 찾을 때까지 반복
            String accNo = ui.searchAccount(); // UI에서 계좌번호 입력
            // 모든 고객 탐색
            for (Customer c : customerList) {
                // 고객의 모든 계좌 탐색
                for (Account a : c.getAccountList()) { // getAccountList() 필요
                    if (a.getAccNo().equals(accNo)) {
                        return a; // 계좌 찾으면 반환
                    }
                }
            }
            // 못 찾은 경우
            System.out.println("그런 계좌 없음");
        }
    }

    // 계좌 조회하기 + 메시지 지정 가능 코드
    public Account selectAccount(String message) {
        String accNo = ui.searchAccount(message); // UI에서 계좌번호 입력
        // 모든 고객 탐색
        for (Customer c : customerList) {
            // 고객의 모든 계좌 탐색
            for (Account a : c.getAccountList()) { // getAccountList() 필요
                if (a.getAccNo().equals(accNo)) {
                    return a; // 계좌 찾으면 반환
                }
            }
        }
        // 못 찾은 경우
        System.out.println("그런 계좌 없음");
        return null;
    }

    // 최초 계좌 생성 유무 판단
    public boolean hasAnyAccount() {
        for (Customer c : customerList) {
            if (c.getAccountList().size() > 0) {
                return true; // 계좌 하나라도 있으면 true
            }
        }
        return false; // 고객이 없거나 모두 계좌 없음
    }

}
