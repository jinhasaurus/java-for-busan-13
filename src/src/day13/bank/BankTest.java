package src.day13.bank;

public class BankTest {
    // 뱅크테스트 안에서 쓸 수 있도록 선언!!
    private static final BankManager bm = new BankManager();
    public static final BankUI ui = new BankUI();

    public static void main(String[] args) {
        // 메뉴 출력
        while (true) {
            ui.printMenu();
            int choice = ui.selectMenu();
            switch (choice) {
                case 1: // 계좌 생성
                    bm.selectAccountType();
                    break;
                case 2: // 입금하기
                    if (bm.hasAnyAccount()) {
                        Account a = bm.selectAccount(); // 계좌 선택
                        long amount = ui.inputAmount(); // 입금 금액 입력
                        bm.deposit(a, amount);
                        break;
                    } else {
                        System.out.println("현재 계좌가 없습니다. 먼저 계좌를 생성해주세요.");
                        break;
                    }
                case 3: // 출금하기
                    if (bm.hasAnyAccount()) {
                        Account a = bm.selectAccount(); // 계좌 선택
                        long amount = ui.inputAmount(); // 출금 금액 입력
                        bm.withdraw(a, amount);
                        break;
                    } else {
                        System.out.println("현재 계좌가 없습니다. 먼저 계좌를 생성해주세요.");
                        break;
                    }

                case 4: // 이체하기
                    if (bm.hasAnyAccount()) {
                        Account a = bm.selectAccount("출금할 계좌번호를 입력하세요.");
                        Account target = bm.selectAccount("입금받을 계좌번호를 입력하세요.");
                        long amount = ui.inputAmount();
                        bm.transfer(a, target, amount);
                        break;
                    } else {
                        System.out.println("현재 계좌가 없습니다. 먼저 계좌를 생성해주세요.");
                        break;
                    }
                case 5: // 전체 출력
                    if (bm.hasAnyAccount()) {
                        bm.printAll();
                        break;
                    } else {
                        System.out.println("현재 계좌가 없습니다. 먼저 계좌를 생성해주세요.");
                        break;
                    }

                case 6: // 프로그램 종료
                    System.out.println("프로그램 종료");
                    return;
                default: // 잘못 입력
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}