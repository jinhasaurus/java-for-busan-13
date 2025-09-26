package src.day13.bank;

public class Account {
    String accNo;
    long balance;

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
}
