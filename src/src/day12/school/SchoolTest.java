package src.day12.school;

public class SchoolTest {
    public static void main(String[] args) {
        // 매니저 인스턴스 만들기
        Manager m = new Manager(10);

        // 학생 인스턴스 만들기 >> 매니저가 할 수 있는 동작
        // 선생 인스턴스 만들기 >>  매니저가 할 수 있는 동작
        // 학생과 선생은 매니저 인스턴스 아래 관리되도록 만들기

        Person p = new Person();
        p.name = "진하";
        p.age = 26;

        // 매니저가 만들기
        m.createStudent().printProfile();
        m.addPerson(p);
        m.createTeacher().printProfile();
        m.addPerson(p);
        m.createStudent().printProfile();
        m.addPerson(p);

        // 몇 개 저장되어잇는지 확인하고싶다....
        System.out.println(m.index);

        // 그냥 내가 냅다 만듬
        Student a1 = new Student("진하하",26,1000);
        m.addPerson(a1);
        Teacher t = new Teacher ("하하진",30, "eng");
        m.addPerson(t);

        m.printAll();
        a1.equals(t); // toString이 뭔데....???

        a1.toString();

        // 학생과 선생의 프로필 출력
        // - 프로필 출력문
        // -- 나이: ㅇㅇ, 이름: ㅇㅇ
        // 저는 선생/학생입니다.
        // a1.printProfile();
        // t.printProfile();
        // 학생의 경우 학번과 함께 출력 선생의 경우 담당 과목을 함께 출력

    }


}
