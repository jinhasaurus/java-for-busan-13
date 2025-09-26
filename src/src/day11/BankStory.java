package src.day11;

public class BankStory {
    private static BankManager bm = new BankManager();
    // 메인 바깥에 스태틱으로 bm을 생성해두면 메인 바깥 다른 메서드에서도 활용이 가능함.
    // 고객을 생성한다 > 은행 매니저가 할 수 있는 일.
    private static BankUI ui = new BankUI(); // 객체를 만들어놓기

    public static void main(String[] args) {
        while (true) {
            // 메뉴 보여주기
            ui.printMainMenu();
            int no = ui.selectMenu();
            switch (no) {
                case 1:
                    processCreateAccount();
                    break;
                default:
                    break;
            } // switch 종료
        } // while 종료

    }

    // 신규 고객 생성
    // 신규 고객이 생성될 당시에 계좌도 하나 생성해야 하고 계좌는 누구 계좌인지 알아야 함
    // 고객의 계좌 목록에 방금 생성한 계좌를 add
    public static void processCreateAccount() {
        // 분기 생성
        while (true) {
            // 계좌생성 초기 메뉴 보여주기 1. 신규고객 2. 기존고객 3. 상위 메뉴로 가기
            ui.printCreateAccountOpt();
            int no = ui.selectMenu();
            switch (no) {
                case 1:
                    Customer c1 = bm.createCustomer();
                    // Customer c1 = new Customer("이소베양","111111-1111111","UFO");
                    Account a1 = bm.createAccount(c1);
                    //Account a1 = new Account("1000-111-1111", c1,9000);
                    // c1.accounts.add(a1); 어카운트는 잠겨 있기 때문에 이렇게 불러올 수는 없음.
                    c1.getAccounts().add(a1); // c1이 가진 accountlist에 a1을 넣어라!!!
                    // 은행 매니저의 관리 고객 목록에 고객을 추가
                    bm.addCustomer(c1);
                    break;

                case 2: {
                    // 주민번호 입력받아 bm이 관리중인 고객목록에 있는지 확인하기
//                    String ssn = ui.inputSsn();
//                    Customer c = bm.searchCustomer(ssn);
//                    if (c != null) {
//                        Account a2 = bm.createAccount(c);
//                        c.getAccounts().add(a2);
//                    } else {
//                        System.out.println("고객 검색 실패.");
//                    }
                    break;
                }
                case 3:
                    return;

                default:
                    System.out.println("없는 메뉴 번호");
                    break;
            }// switch 끝
        }// while 끝


    }
}
