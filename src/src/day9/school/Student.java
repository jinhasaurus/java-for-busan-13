package src.day9.school;

public class Student {

    // 학번 : 처음 정해지면 바뀌지 않는다*유의 >> final
    final int studentNum;
    // 이름 :
    String name;
    // 국어
    int korean;
    // 영어
    int english;
    // 수학
    int math;

    Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    public void Studentscore(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}

class GradeReport{

    public static void gradeReport(Student a) {

        System.out.println("이름 : " + a.name);
        System.out.println("국어 점수 : " + a.korean);
        System.out.println("영어 점수 : " + a.english);
        System.out.println("수학 점수 : " + a.math);
    }
}
