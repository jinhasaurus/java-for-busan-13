package src.day8;

public class Account {
    // 어카운트 정보 저장

    String accNo; // 계좌 번호
    long balance; // 잔고
    Customer customer; // 계좌 소유주 정보

    Account(String accNo, long balance, Customer customer) {
        this.accNo = accNo;
        this.balance = balance;
        this.customer = customer;
        getAccountInfo();
    }

    void getAccountInfo() {
        System.out.printf("소유주:%s \n계좌번호:%s \n잔고:₩%d원\n\n", this.customer.name, this.accNo, this.balance);
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(long amount) {
        if (balance < amount) {
            System.out.println("잔고가 부족합니다.");
        } else {
            balance -= amount;
        }
    }

    public void transfer(long amount, Account target) {
        if (balance>amount) {
            balance -= amount;
            target.deposit(amount);
            //target.balance += amount;
            System.out.println("이체에 성공하였습니다.");
        } else {
            System.out.println("이체 잔고가 부족합니다.");
        }
        target.getAccountInfo();
    }
}
