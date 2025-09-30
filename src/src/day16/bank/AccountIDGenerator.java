package src.day16.bank;

public class AccountIDGenerator {  // 단순히 계좌번호를 생성하는 녀석

    // 계좌번호 관련 일련번호
    static int serialNum = 1001; // 고객 씨리얼넘버이므로 int 선언

    //
    public static String generate () {
        String accNo = BankManager.BANK_NO + "-" + BankManager.AREA_NO + "-" + (serialNum++);
        return accNo;
    }

}
