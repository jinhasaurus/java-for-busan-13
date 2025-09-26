package src.day9.bank;

public class Account {
    // 접근 제어자
    // public : 외부 클래스 어디서나 접근 가능
    // default(공란) : 같은 패키지 내부에서만 접근 가능.
    // protected : 같은 패키지 내부와 상속관계인 클래스에서만 접근 가능
    // private : 같은 클래스 내부에서만 접근할 수 있다. (젤 까다로움)

    private String accNo; // 계좌 번호
    private long balance; // 잔고
    Customer customer; // 계좌 소유주 정보

    Account(String accNo, long balance, Customer customer) {
        this.accNo = accNo;
        this.balance = balance;
        this.customer = customer;
        System.out.println("계좌가 생성되었습니다.");
        getAccountInfo();
    }

    void getAccountInfo() {
        System.out.printf("소유주:%s \n계좌번호:%s \n잔고:₩%d원\n\n", this.customer.name, this.accNo, this.balance);
        // 여기서 this는 호출한 주체임...
    }

    public void getAccNo(String accNo) {
        this.accNo = accNo;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
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
        if (canWithdraw(amount)) {
            balance -= amount;
            target.deposit(amount);
            //target.balance += amount;
            System.out.println("이체에 성공하였습니다.");
        } else {
            System.out.println("이체 잔고가 부족합니다.");
        }
        target.getAccountInfo();
    }


    // 프라이빗 메서드 (내부로직, 외부에서 알 필요 없음)
    private boolean canWithdraw(long amount) {
        return balance >= amount;

    }
}
