package src.day9.bank;

public class Customer {
    String name;
    String ssn;
    String address;
    int age;

    // 특별 메서드~~ 디폴트 생성자 : 생성자를 안 만들었을 때 자동으로 생성
    // 생성자 : 클래스 이름과 같은 이름을 가진 메서드
    // new 키워드랑 같이 씀
    // 반환 타입 쓰지 않음
    Customer(){

    }

    // 필드는 보라색 글씨..
    // 이름이 같은 매서드.. 매개변수 목록이 다른 메서드..
    // 생성자 오버로드... 영향을 주지 않는다..
    // 생성자는 같은 이름으로 여러 개 만들 수 있다.
    // 디폴트 생성자와... 사용자 정의 생성자....
    /* Customer(String cname, String cssn, String caddress){
        // 중요중요 맨 앞에 c 써야 함
        name = cname; // 자리 바뀌면 안 됨... 뱉어낼 결과에다가 재료를 넣는 거임.....ㅜㅜ
        ssn = cssn;
        address = caddress;
    }
     */

    //이름 똑같이 쓰고 싶을 때
    // this. 를 쓰기 ... 곧 생성될 인스턴스를 가리키는 말.. 객체...
    //

    //클래스의 전체 이름을 사용해서 객체 생성하기
    // day9.bank.Account a2 = new day9.bank.Account ("111-222-", 1200, c1)

    Customer(String name, String ssn, String address){
        // 중요중요 맨 앞에 c 써야 함
        this.name = name; // 자리 바뀌면 안 됨... 뱉어낼 결과에다가 재료를 넣는 거임.....ㅜㅜ
        this.ssn = ssn;
        this.address = address;
    }
}

