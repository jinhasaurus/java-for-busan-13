package src.day10.Array.arraylist;

public class StudentArrayListTest {
    public static void main(String[] args) {
        Student s = new Student("키무쨩");
        Subject subject = new Subject();
        subject.subjectName = "국어";
        subject.score=98;
        s.subjectList.add(subject);
        Subject eng = new Subject();
        eng.subjectName = "영어";
        eng.score = 0;
        s.subjectList.add(subject);
        s.subjectList.add(eng);
        s.showStudentInfo();


        // 생성자 부분 whatgrade 할 수 잇게 하기...
        //
    }
}
