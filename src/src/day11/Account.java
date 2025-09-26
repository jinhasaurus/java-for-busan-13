package src.day11;

public class Account {
    private String accNo; // 계좌번호
    private Customer customer; // 계좌 소유주 하나의 계좌는 한 명이 가지는 거기 때문에 단일로.. 먼소리고이게
    private long balance; // 잔고

    public Account(String accNo, Customer customer, long balance) {
        this.accNo = accNo;
        this.customer = customer;
        this.balance = balance;
    }



}
