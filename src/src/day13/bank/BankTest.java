package src.day13.bank;

public class BankTest {
    public static void main(String[] args) {
        BankManager bm = new BankManager();
        BankUI ui = new BankUI();

        // 메뉴 출력
        while (true) {
            ui.printMenu();
            int choice = ui.selectMenu();
            switch (choice) {
                case 1:
                    bm.selectAccountType();
                    break;
                case 2:
                    Account a = bm.selectAccount(); // 계좌 선택
                    long amount = ui.inputAmount(); // 입금 금액 입력
                    bm.deposit(a, amount);
                    break;
                case 3:
                    a = bm.selectAccount(); // 계좌 선택
                    amount = ui.inputAmount(); // 출금 금액 입력
                    bm.withdraw(a,amount);
                    break;
                case 4:
                    a = bm.selectAccount();
                    Account target = bm.selectAccount();
                    amount = ui.inputAmount();
                    bm.transfer(a, target, amount);
                    break;
                case 5:
                    bm.printAll();
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