package src.day14.shipping;

public class FuelNeedsReport {
    public static void printReport() {
        Company company = Company.getInstance();
        Vehicle[] vehicles = company.getVehicles(); // Vehicle 배열 반환


        for (int i = 0; i < vehicles.length; i++) {
            Vehicle v = vehicles[i];
            if (v != null) {
                v.printFuelNeeds();
            }
        }

        /*
        필요 연료량 계산
        주행가능거리/연료효율 =

         */

    }
}
