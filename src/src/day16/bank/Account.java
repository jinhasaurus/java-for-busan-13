package src.day16.bank;

public class Account implements Comparable<Account> {
    String accNo;
    private long balance;

    public Account (String accNo, long balance) {
        this.accNo = accNo;
        this.balance = 0;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }



    @Override
    public int compareTo(Account other) {
        // [수정] 계좌번호(accNo)를 기준으로 정렬합니다.
        // String의 compareTo()를 사용합니다.
        return this.accNo.compareTo(other.accNo);
    }
}
