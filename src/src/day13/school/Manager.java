package src.day13.school;

import java.util.Scanner;

public class Manager {
    int SCHOOL_ID = 1000;
    Scanner scan = new Scanner(System.in);

    Person[] schoolMem; // 배열 필드 선언 먼저
    int index = 0;

    public Manager(int size) {
        schoolMem = new Person[size];
    }

    // 메뉴 프린트
    public void printMenu() {
        System.out.println("관리메뉴 번호를 입력해주세요.");
        System.out.println("1. 등록 (" + index + "/" + schoolMem.length + ")");
        System.out.println("2. 목록 확인");
        System.out.println("3. 찾기");
        System.out.println("4. 삭제");
        System.out.println("5. 관리메뉴 종료");
        System.out.println("메뉴를 선택하세요 : ");
    }

    // 공통 입력받기
    public String inputName() {
        System.out.println("이름을 입력하세요.");
        return scan.nextLine();
    }

    public int inputAge() {
        System.out.println("나이를 입력하세요.");
        int age = scan.nextInt();
        scan.nextLine();
        return age;
    }

    // 학생 만들기
    public void createStudent() {
        String name = inputName();
        int age = inputAge();
        int studentID = SCHOOL_ID++;
        Student a = new Student(name, age, studentID);
        addPerson(a);
    }

    // 선생 만들기
    public void createTeacher() {
        String name = inputName();
        int age = inputAge();
        System.out.println("담당과목을 입력하세요.");
        String subject = scan.nextLine();

        Teacher t = new Teacher(name, age, subject);
        addPerson(t);
    }

    // 만든 학생을 매니저가 관리하는 사람 리스트에 넣기
    private void addPerson(Person p) {
        schoolMem[index++] = p;
    }

    // 사람 삭제하기
    public void deletePerson() {
        System.out.println("삭제할 사람의 이름을 입력해주세요.");
        String whatname = scan.nextLine();

        int deletedcount = 0;

        for (int i = 0; i < index; ) {
            /*
            for (int i = 0;i<index;i++) {   // 요소 체크하는 코드
                if (schoolMem[i] = null && schoolMem[i].name.equals(name)) {
                    for (int j = 1; j<index;j++) {
                        p[j] = p[j+1];
                    }
                    count++;
                    index--;
                    i--;
                }
            }
             */

            if (schoolMem[i].name.equals(whatname)) {
                for (int j = i; j < index - 1; j++) {
                    schoolMem[j] = schoolMem[j + 1];
                }
                schoolMem[index - 1] = null;
                index--;
                deletedcount++;
            } else {
                i++; // 이름이 다르면 다른 인덱스로 이동
            }
        }
        if (deletedcount > 0) {
            System.out.println((deletedcount) + "명 삭제 완");
        } else {
            System.out.println("그런 사람 ㄴㄴ");
        }
    }

    // 관리하는 학생 모두 출력하기
    public void printAll() {
        for (int i = 0; i < index; i++) {
            schoolMem[i].printProfile();
        }
        // 혹은 이렇게
        // for (Person person : p) {
        //  if (person!=null person.printProfile);
        //  }
    }

    // 사람 찾기
    public void findPerson() {
        String whatname = inputName();
        int count = 0;

        // 이거 해결해야 댐
        for (int i = 0; i < index; i++) {
            if (schoolMem[i] != null && schoolMem[i].name.equals(whatname)) {
                schoolMem[i].printProfile();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("그런 사람 ㄴㄴ");
        } else {
            System.out.println(count + "명의 검색 결과를 출력했습니다.");
        }
    }

    // 사람 만들기
    public void createPerson() {
        System.out.println("추가하고 싶은 대상을 선택해주세요. / 1. 학생 2. 선생");
        int choose2 = scan.nextInt();
        if (choose2 == 1) {
            createStudent();
        } else if (choose2 == 2) {
            createTeacher();
        } else {
            System.out.println("잘못 입력하셨습니다. 번호를 입력해주세요.");
        }
    }
}

