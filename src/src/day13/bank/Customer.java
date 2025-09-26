package src.day13.bank;

import java.util.ArrayList;

public class Customer {
    String name;
    String ssn; // 주민번호
    String address;

    private ArrayList<Account> accountList = new ArrayList<>();

    public Customer(String name, String ssn, String address) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
    }

    // 계좌 추가 (private니까 외부에서 접근할 수 있도록)
    public void addAccount(Account a) {
        accountList.add(a);
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }
}
