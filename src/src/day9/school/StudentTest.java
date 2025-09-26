package src.day9.school;

public class StudentTest {
    public static void main(String[] args) {
        //학생 한 명 (기본 정보만 생기고, 점수 없는 상태)
        Student a = new Student(123456789,"키무상");

        //학생에게 점수 부여 (국영수 한꺼번에 부여하기)
        a.Studentscore(100,90,50);

        //학생의 성적 리포트 출력하기(리포트 출력기 클래스가 가진 static 메서드로)
        GradeReport.gradeReport(a);

        Student a2 = new Student(2222,"키22무상");
        GradeReport.gradeReport(a2);

        a2.Studentscore(90,40,80);
        GradeReport.gradeReport(a2);


    }
}
