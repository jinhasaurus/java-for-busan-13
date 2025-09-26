package src.day14.shipping;

public class Truck extends Vehicle {
    String name;

    public Truck(double maxLoad) {
        capacity = maxLoad+"kg";
    }

    public String getName() {
        return "트럭";
    }

    @Override
    public double calcTripDistance() {
        return 100.0;
    }

    @Override
    public double calcFuelEfficiency () {
        return 8.1;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + getName() + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }

    // 연료 필요량 계산
//    @Override
//    public double calcFuelNeeds() {
//        return calcTripDistance() / calcFuelEfficiency();
//    }
}
