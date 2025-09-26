package src.day7.classpart;

public class Person {
    String name;
    float height;
    float weight;


    // 이해가 안 되네예!!!!

    // 생성자
    // 객체가 생성될 때 호출되어 객체의 초기 상태를 설정하는 특수한 메서드
    // new
    // 기본 생성자(디폴트 생성자) 생성자를 직접 만들지 않으면 자동으로 생기는 생성자.
    // 직접 만드는 이유는 초기상태를 설정할 수 있게 만들려고.

    Person () {

    }

    Person (String pname) {
        name = pname;
        System.out.println("새 객체가 생성되었습니다.");
    }

}
