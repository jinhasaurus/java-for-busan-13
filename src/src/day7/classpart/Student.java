package src.day7.classpart;

public class Student {
    // 객체란? 현실 세계의 사물이나 개념을 프로그래밍적으로 표현한 것.
    // 또는 그 표현을 코드로 구현해 생성된 실체. 주로 >> 인스턴스라고 지칭함.


    // 멤버 변수 (필드) : 객체의 상태, 정보 (객체가 아는 것)
    int grade;
    int studentID;
    String studentName;
    // 아직 값을 안 가짐. 이런 정보가 포함될 수 있다~ 정도만 쓴겨

    // 메서드 : 객체의 동작, 객체의 기능 (객체가 하는 것)
    void goToSchool(int time) {
        System.out.println("학생이 학교에 "+time+"시에 갑니다.");

    }

}
