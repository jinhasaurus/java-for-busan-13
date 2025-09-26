package src.day13.bank;

import static src.day13.bank.BankManager.AREA_NO; // 뱅크매니저가 갖고 있는 번호이므로 import
import static src.day13.bank.BankManager.BANK_NO; // 뱅크매니저가 갖고 있는 번호이므로 import

public class AccountIDGenerator {  // 단순히 계좌번호를 생성하는 녀석

    // 계좌번호 관련 일련번호
    static int serialNum = 001; // 고객 씨리얼넘버이므로 int 선언

    //
    public static String generate () {
        String accNo = BANK_NO + "-" + AREA_NO + "-" + (serialNum++);
        return accNo;
    }

}
