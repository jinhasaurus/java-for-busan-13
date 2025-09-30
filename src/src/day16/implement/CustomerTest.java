package src.day16.implement;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.sell();
        c.buy();
        c.order();


        // Buyer 입의 customer 객체를 묶어놓을 수 있다.
        // 상속 관계에서 하위 클래스는 상위 타입으로 묵시적 형변환 가능
        Buyer b = c;
        b.buy();
        b.order();

        Seller s = c;
        s.order();
        s.sell();

        // s라는 객체에 담겨 잇는 애의 타입이 Customer라면 강제 형변환 > 이러고 나면 buy도 sell도 가능
        if (s instanceof Customer) {
            Customer c1 = (Customer) s;
            // s instance of Customer c1 해도 됨
            c1.buy();
            c1.sell();
        }


    }
}
