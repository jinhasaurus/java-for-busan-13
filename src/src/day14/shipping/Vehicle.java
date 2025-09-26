package src.day14.shipping;

public abstract class Vehicle {
    String capacity;

    abstract double calcTripDistance(); // 주행거리

    abstract double calcFuelEfficiency(); // 연비

    // 공통 연료 필요량 계산
    // 템플릿 메서드 : 틀 자체는 자식도 동일한 방식으로 구현되지만 내부 동작이 추상으로 선언되어 있기 때문에 자식마다 다르게 동작함.
    // 주로 실행순서나 시나리오 정의하게 됨
    // 자식이 재정의할 수 없게 final로 선언
    public final double calcFuelNeeds() {
        return calcTripDistance() / calcFuelEfficiency();
    }

    // 프린트 함수
    public void printFuelNeeds () {
        System.out.printf("탈 것 %s은 연료가 %.2f 필요합니다.\n", getName(), calcFuelNeeds());
    }

    abstract String getName();

    @Override
    public String toString() {
        return "Vehicle{" +
                "capacity='" + capacity + '\'' +
                '}';
    }
}
