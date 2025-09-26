package src.day9.bank;

// 메인에 스태틱이 써 있어야 하는 이유
/*

 */

public class BankTest {
    public static final String BANK_NO = "123";
    public static final String AREA_NO = "0024";

    public static void main(String[] args) {
        //손님
        Customer c1 = new Customer("키무상", "11-11", "니혼");
        Account a1 = new Account("1111-11111", 12121, c1);

        a1.deposit(99999);
        a1.getAccountInfo();

        // 계좌번호 생성하기
        AccountIDGenerator.genAccID(BANK_NO, AREA_NO);
        String newAccID = AccountIDGenerator.genAccID(BANK_NO, AREA_NO);
        System.out.println(newAccID);
        System.out.println(AccountIDGenerator.genAccID(BANK_NO, AREA_NO));

        Account a3 = new Account(AccountIDGenerator.genAccID(BANK_NO, AREA_NO), 5000, c1);

//        AccountIDGenerator accountIDgenerator = new AccountIDGenerator();
//        accountIDgenerator.genAccID("ddd","ddd");

    }
}
