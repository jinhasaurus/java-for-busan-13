package src.day11;

import day9.bank.AccountIDGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class BankManager {
    public static final String BANK_NO = "100"; // 은행 매니저가 지점번호 갖고 있자!! 상수로 선언.
    public static final String AREA_ID = "1000"; // AREA_ID도 상수로 주기
    private ArrayList<Customer> customerList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // 이렇게 적을 때 요기 안에 가져오는 거는 변수 이름이 뭐든 상관 없나?
    public void addCustomer (Customer c) {
        customerList.add(c);
    }

    public Customer createCustomer() {
        Customer c = null;
        System.out.println("이름 : ");
        String name = input.nextLine();
        System.out.println("주민등록번호 : ");
        String ssn = input.nextLine();
        System.out.println("주소 : ");
        String address = input.nextLine();
        c = new Customer(name,ssn,address);
        return c;
        // return c = new Customer (name,ssn,address);
    }

    public Account createAccount(Customer c) {
        Account a = null;
        String accNo = AccountIDGenerator.genAccID(BANK_NO,AREA_ID);
        System.out.println("계좌번호 : "+accNo);
        System.out.println("초기 입금 금액 : ");
        long balance = input.nextLong();
        a = new Account (accNo, c, balance);
        return a;
        //Account a1 = new Account("111-111-1111",c1,9000);
    }

    public void searchCustomer(String ssn) {
        System.out.println(ssn); // 확인용
//        Customer c = null;
//        for (Customer customer : customerList) {
//            if (customer.ssn == ssn ) { // 어캐할 건지............
//                c = customer;
//            }
//        }
//        return c;
//
    }
}
