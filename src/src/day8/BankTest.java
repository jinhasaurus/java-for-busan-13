package src.day8;

public class BankTest {
    // 종잇장ㅎㅎ
    public static void main(String[] args) {
        Customer customer1 = new Customer(); // 객체생성 문법??
        System.out.println(customer1.name); // 뒤에 괄호 넣는거랑 아닌 거 차이?? 다른 파일에 있는 거 소환하는 거?
        System.out.println(customer1.age);// 객체가 생성될 때는 디폴트 값으로 생성된다.

        customer1.name="진하";
        customer1.ssn = "000000-0000000";
        customer1.address = "부산 무역회관";
        customer1.age = 15;
        System.out.println(customer1.name);
        System.out.println(customer1.ssn);
        System.out.println(customer1.address);
        System.out.println(customer1.age);

        Customer customer2 = new Customer();
        customer2.name="지환";
        customer2.ssn = "000000-0000001";
        customer2.address = "케케켁";
        customer2.age = 16;
        System.out.println(customer2.name);
        System.out.println(customer2.ssn);
        System.out.println(customer2.address);
        System.out.println(customer2.age);

        /*
        여기서 customer2는 지역 변수다...
        Customer 안에서 움직이는 지역 변수다...
        머지...
        지역 변수는 stack에 저장되고 stack이 사라지면 지역 변수가 사라지고.........
        실체는 heap에 저장된다.. 실체...
        heap에서 활동하는 메모리 관리 해주는 친구 GarbageCollector가 리소스 해제를 자동으롤 처리해준다.
         */

        Customer customer3 = customer2;
        System.out.println(customer2.name);
        customer1 = customer3;
        customer2 = new Customer();

        // 디폴트 생성자는 생성자를 안 만들었을 때 자동으로 생성됨.
        // 사용자정의 생성자가 존재하는 경우 디폴트 생성자는 없는 게 됨

        Account ac1 = new Account("계좌번호", 12415, customer2);
        System.out.println(ac1.accNo);
        ac1.accNo = "0000-000-0000";
        System.out.println(ac1.accNo);
        ac1.customer = customer1;
        System.out.println(ac1.customer.name); // 객체가 객체를 가질 수 있다.

        // 다른 방법!!

        Customer c1 = new Customer("박현규", "000000-0000000", "서면");
        System.out.println(c1.name);

    }
}
