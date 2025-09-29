package src.day15.star;


// 이중상속 되지 않도록 묶어놓는 방법
// SCV라는 객체가 Worker의 역할을 가지게 한다

public class Terran extends Race {

    // 생성자 있어도 됨. 상속을 거쳐서 SCV 상속할 때 부모로부터 상속받은 생성자 사용하면 됨.
    public Terran () {
        super ("테란");
    }


    @Override
    void specialSkill() {

    }
}
