package src.day12.school;

import java.util.Scanner;

public class Manager extends Person {

    int SCHOOL_NUM = 1000;

    Scanner scan = new Scanner(System.in);
    // 몇 명을 관리할 수 있는 매니저인지 : 사람을 여러 명 저장할 수 있는 필드(배열 타입)
    // ArrayList<Person> schoolMembers = new ArrayList<>();
    private Person[] p;

    // 관리 중인 사람의 수
    // int smNum = schoolMembers.size();
    public int index = 0;

    public Manager (int size) {
        p = new Person[size];
        // size가 한 칸 씩 채워질 때마다 index가 올라가야 함.
    }

    // 학생 인스턴스 만들기
    public Student createStudent () {
        commonInput();
        int studentID = SCHOOL_NUM++;
        Student a = new Student(name,age,studentID);
        return a;
    }

    // 선생 인스턴스 만들기
    public Teacher createTeacher () {
        commonInput();
        System.out.println("담당 과목을 알려주세요");
        scan.nextLine();
        String subject = scan.nextLine();
        Teacher t = new Teacher(name,age,subject);
        return t;
    }

    public void commonInput() {
        System.out.println("이름을 알려주세요.");
        name = scan.nextLine();
        System.out.println("나이를 알려주세요.");
        age = scan.nextInt();
    }

    // 매니저 배열 안에 한 칸 차지한다
    public void addPerson(Person person) {
        // 사람 타입은 스튜던드 타입을 받을 수 있따.
        p[index++] = person;
        //index번째에... 한 칸 차지하고 난 다음에 증가해라...
    }

    public void printAll () {
        for (int i = 0; i<index;i++){
            p[i].printProfile();
        }
    }

    public void findPerson (String name) {

    }
}