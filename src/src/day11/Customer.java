package src.day11;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String ssn;
    private String address;
    private ArrayList<Account> accounts = new ArrayList<>(); // 계좌 리스트.

    public Customer(String name, String ssn, String address) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
    }

    public Customer(String name) {
        this.name=name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    // 고객사마가 계좌목록 가질 때 정해진 개수가 아니라 계속 생성할 수도 있다고 가정하는 거기 때문에.
}

// 맨 처음 등장했을 때 이 고객이 멀 가지고 있어야 하냐.를 지정하는 게 생성자의 파라메터.

