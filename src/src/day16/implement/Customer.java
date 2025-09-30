package src.day16.implement;

public class Customer implements Buyer, Seller {
    @Override
    public void buy () {
        System.out.println("구매하기");
    }

    @Override
    public void sell() { // 구현하는 입장. 상위보다 좁은 범위를 가지면 안 됨
        System.out.println("판매하기");
    }

    @Override
    public void order() {
        System.out.println("손님이 주문을 합니다");
    }
}
