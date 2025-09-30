package src.day16.jdbc;

public interface Query {
    // - 표준화 : 여러 클래스가 동일한 규칙을 따라야 하는 경우
    // - 다형성 확보 : 서로 다른 클래스를 같은 타입(인터페이스로)로 취급 가능
    // - 확장성 : 기능이 바뀌어도 규격(인터페이스)가 동일하다면 기존 코드 영향을 최소화 가능

    String selectQuery();


}
