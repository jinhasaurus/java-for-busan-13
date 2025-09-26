package src.day14.shipping;

public class Company {
    // 싱글톤 패턴
    /*
    전체 애플리케이션 내에서 오직 한 개의 객체만 존재하도록 보장하는 디자인 패턴
    회사라는 객체가 필요하긴 해서 클래스를 만들긴 할 거지만 클래스를 통해서 여러 개의 인스턴스 생성할 필요는 없어서
    어디서든 동일한 인스턴스를 공유해 쓰도록 만드는 구조
    전역으로 접근가능한 단일 인스턴스 제공
     */

    //컴퍼니가 로드될 당시에 곧바로 객체 생성되게 하고 싶다면 new 해서 할당하면 됨
    // 유일한 객체 저장소

    /*
    전역으로 접근 가능한 인스턴스 만드는 방법

    1. 생성자를 private으로 만들기(객체 생성 막기)
    2. 내부에서 생성한 인스턴스를 저장할 필드 만들기
    - 인스턴스 오류 방지를 위해 private
    - 클래스 로드 시점에 필드가 존재해야 하므로 static
   3. 내부에서 생성된 객체를 외부에서 참조할 수 있게 만들기 위한 public 메서드 만들기
     */

    private static Company instance = new Company();

    private String name;
    private Vehicle[] vehicles;
    private int v_num;

    // 운송수단 추가 메서드
    void addVehicle(Vehicle v) {
        vehicles[v_num++] = v;
    }

    // 컴퍼니 클래스가 존재하는 시점에 바로 접근할 수 있어야 함
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
            // 최초 요청시 객체가 생성되도록 함
        }
        return instance;
    }

    // 운송수단 목록 출력 메서드
    void printVehiclesList () {
        for (Vehicle v : vehicles) {
            if (v != null) {
                System.out.println(v);
            }
        }
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    // private를 붙여주면 컴퍼니 클래스가 로드된 순간에 컴퍼니 객체가 존재하게 만들어야 함.
    private Company() {
        vehicles = new Vehicle[10];
    }
}
