package src.day13.bank;

public class Account {
    String accNo;
    Customer c;
    long balance;

    private void Account (String accNo, Customer c, long balance) {
        this.accNo = accNo;
        this.c = c;
        this.balance = balance;
    }

}
