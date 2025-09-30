package src.day16.bank;

public class BankTest {
    // 뱅크테스트 안에서 쓸 수 있도록 선언!!
    // 싱글톤으로?? 해도 댄다?? 싱글톤이 머더라
    // 여러 개의 객체 필요한 게 ㄴㄴ
    // 여기 fianl은 클래스 안의 final
    private static final BankManager bm = new BankManager();
    public static final BankUI ui = new BankUI();

    public static void main(String[] args) {
        // 메뉴 출력
        while (true) {
            ui.printMenu();
            Menu choice = ui.selectMenu();
            switch (choice) {
                case CREATE: // 계좌 생성
                    bm.selectAccountType();
                    break;
                case DEPOSIT: // 입금하기
                    if (bm.hasAnyAccount()) {
                        Account a = bm.selectAccount(); // 계좌 선택
                        long amount = ui.inputAmount(); // 입금 금액 입력
                        bm.deposit(a, amount);
                        break;
                    } else {
                        System.out.println("현재 계좌가 없습니다. 먼저 계좌를 생성해주세요.");
                        break;
                    }
                case WITHDRAW: // 출금하기
                    if (bm.hasAnyAccount()) {
                        Account a = bm.selectAccount(); // 계좌 선택
                        long amount = ui.inputAmount(); // 출금 금액 입력
                        bm.withdraw(a, amount);
                        break;
                    } else {
                        System.out.println("현재 계좌가 없습니다. 먼저 계좌를 생성해주세요.");
                        break;
                    }

                case TRANSFER: // 이체하기
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
                case PRINTALL: // 전체 출력
                    if (bm.hasAnyAccount()) {
                        bm.printAll();
                        break;
                    } else {
                        System.out.println("현재 계좌가 없습니다. 먼저 계좌를 생성해주세요.");
                        break;
                    }

                case EXIT: // 프로그램 종료
                    System.out.println("프로그램 종료");
                    return;
                default: // 잘못 입력
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}