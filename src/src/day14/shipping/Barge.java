package src.day14.shipping;

public class Barge extends Vehicle {

    public Barge(double maxLoad) {
        capacity = maxLoad+"kg";
    }

    String name;

    public String getName() {
        return "통통배";
    }

    @Override
    double calcTripDistance () {
        return 50.0;
    }

    @Override
    public double calcFuelEfficiency () {
        return 5.2;
    }

    @Override
    public String toString() {
        return "Barge{" +
                "name='" + getName() + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }


//    // 연료 필요량 계산
//    @Override
//    public double calcFuelNeeds() {
//        return calcTripDistance() / calcFuelEfficiency();
//    }
}
