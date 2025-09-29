package src.day15.star;

public interface Worker {
    // 동작의 목록만이 주어진다.
    // 구현 내용은 달라질 수 있음.
    void getmineral();
    void getGas();

    // 소개한다라는 동작을 Worker라는 역할 가진 친구들이라면 전부 수행할 수 있으면 좋겠음.
    // Worker의 기본 동작
    // 여기서의 default는 기본을 의미. 접근 제한 아님(?)
    default void introduce () {
        System.out.println("나는 일꾼입니다.");
    }
}
