package src.day13.bank;

public class Customer {
    String name;
    String ssn; // 주민번호
    String address;

    public Customer(String name, String ssn, String address) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
    }

    public void getAccount () {
        Account a = new Account();
    }

}
