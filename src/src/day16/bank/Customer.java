package src.day16.bank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Customer implements Comparable<Customer> {
    String name;
    String ssn; // 주민번호
    String address;

    private Set<Account> accountSet = new TreeSet<>();

    // private ArrayList<Account> accountList = new ArrayList<>();
    // Set으로 정렬


    public Customer(String name, String ssn, String address) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
    }

    // 계좌 추가 (private니까 외부에서 접근할 수 있도록)
    public void addAccount(Account a) {
        // 예전 버전 주석처리
        // accountList.add(a);

        // TreeSet에 추가합니다. Account가 Comparable을 구현했기 때문에 정렬이 자동 적용됩니다.
        accountSet.add(a);
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

    // 예전 버전 주석처리
    // Public ArrayList<Account> getAccountList() {
    //     return accountList;
    // }

    public ArrayList<Account> getAccountList() {
        // TreeSet은 이미 정렬되어 있으므로, List로 변환해도 정렬 순서가 유지됩니다.
        return new ArrayList<>(accountSet);
    }

    public Set<Account> getAccountSet() {
        return accountSet;
    }

    @Override
    public int compareTo(Customer o) {
        // 고객을 주민번호(ssn) 기준으로 정렬합니다.
        return this.ssn.compareTo(o.ssn);
    }

}
