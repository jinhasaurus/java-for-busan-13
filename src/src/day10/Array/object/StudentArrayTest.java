package src.day10.Array.object;

public class StudentArrayTest {
    public static void main(String[] args) {

        // 학생을 세 명 저장할 수 있는 배열
        Student[] students = new Student[3];

        // 학생이 가지는 데이터
        //>> Student에 햇다

        // 필드(정수형 학번, 문자열 이름, 정수형 성적, 문자형 성적)
        // 메서드
        //      - 학생 정보를 출력
        //      - 학생 등급 산출

        // 배열의 각 인덱스를 가리켜 새 학생 객체를 생성하여 할당
        students[0] = new Student("이름", 98);
        students[1] = new Student("이름", 98);
        students[2] = new Student("이름", 98) ;

        // 배열을 순회하여 학생 정보를 출력
        for (Student s : students) {
//            System.out.println(s);
            s.showStudentInfo();
        }

    }
}
