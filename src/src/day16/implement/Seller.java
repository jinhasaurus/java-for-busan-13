package src.day16.implement;

public interface Seller {
    // 인터페이스? 클래스가 반드시 구현해야 할 동작(메서드)의 규격을 정하의 한 설계도
    // can-do 할 수 있는 것 목록을 제공하는 기능 명세서 역할을 함
    // A클래스가 B인터페이스를 구현하도록 설정하면 A는 B가 가진 추상 메서드들을 구현해야만 한다.
    // cf. 추상 클래스랑 안 헷갈리게 조심하기~~
    // B도 기본구현을 제공하는 메서드를 가질 수 있다. (추상 클래스도 일반 메서드 가질 수 있음) (java 8이후, default 키워드 사용)
    // 상속은 단일 상속만 가능. // 인터페이스는 다중구현 혀용. (**)


    // 인터페이스의 메서드는 자동으로 public abstract이므로 구현 클래스에서 public으로 구현해야 한다.
    void sell(); // 구격만 제공함

    default void order() {
        System.out.println("판매자가 주문을 합니다");
    }


}
