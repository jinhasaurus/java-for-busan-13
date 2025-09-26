package src.day8;

// 함부로 손 댈 수 없는 데이터.....

// 화폐갯수
// 타율 계산
// 성적 리포트
// 내일 할 부분 > 정보 은닉, 캡슐화

public class BankTest2 {
    public static void main(String[] args) {
        // 손님 등장
        Customer c1 = new Customer("허경윤", "11-11", "무역회관");
        System.out.println(c1.name+"님이 들어오셧어여");

        // 손님 계좌 개설
        Account a = new Account("11-11-11", 100000000, c1);
//        a.getAccountInfo();

        // 손님2 등장
        Customer c2 = new Customer("류주현", "22-22", "무역회관 1층 계단");
        System.out.println(c2.name+"님 등장");

        // 손님2 계좌 개설
        Account a2 = new Account("22-22-22", 500, c2);

        // 손님 1 추가 입금
        a.deposit(5000);
        a.getAccountInfo();

        // 손님 2 출금
        a2.withdraw(50000);
        a2.getAccountInfo();

        // 손님 1이 손님 2에게 송금
        a.balance = 0;
        a.transfer(400000, a2);
    }
}
