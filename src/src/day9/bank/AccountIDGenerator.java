package src.day9.bank;

/*
Account ID Generator class
형식 : 은행번호 - 지점번호 - 일련번호, ***-****-****

 */

public class AccountIDGenerator {
    // static을 부여한 어쩌구는 인스턴트 부여하지 않아도 사용할 수 있게 됨
    private static int serialNum = 1000;

    public static String genAccID(String bankNo, String areaNo) {
        serialNum++;

        return
                bankNo+"-"+areaNo+"-"+serialNum; // 스트링 있기 때문에 리턴? 왜?
    } // 인스턴스가 굳이 필요 없음? 먼 말이지

    public static void main(String[] args) {
        String accNo = genAccID ("123", "1515");
        System.out.println(accNo);
        String accNo2 = genAccID ("123", "1515");
        System.out.println(accNo2);
        String accNo3 = genAccID ("123", "1515");
        System.out.println(accNo3);
    }
}
