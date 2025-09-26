package src.day14.shipping;

public class ShippingMain {
    public static void main(String[] args) {
        Truck t = new Truck(1000000.0);
        t.getName();
        Truck t2 = new Truck(150000.0);
        t2.getName();
        System.out.println(t == t2);
        Truck t3 = new Truck(90000.0);
        t3.getName();

        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        Barge b1 = new Barge(500000000.0);
        b1.getName();
        Barge b2 = new Barge(6000000.0);
        b1.getName();

        c2.addVehicle(t);
        c1.addVehicle(b1);
        c2.printVehiclesList();
        // c2 에서 출력했을때 c1에 넣은 운송수단 까지 같이 나오는 이유는,
        // 회사 객체가 c1, c2 로 각각 있는 것 처럼 이름이 보이지만,
        // Company 클래스에서 싱글톤 패턴으로 딱 하나의 객체만 생성되도록 만들었기 때문

        FuelNeedsReport.printReport();

    }
}
