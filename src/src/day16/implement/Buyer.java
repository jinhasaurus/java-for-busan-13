package src.day16.implement;

public interface Buyer {

    void buy();

    default void order() {
        System.out.println("구매자가 주문을 합니다");
    }
}
