package src.day10.Array.object;

public class Student {
    static int serialNum = 1000;
    int studentID;
    int score;
    char grade;
    String name;

    public Student(String name, int score) {
        serialNum++;
        this.studentID = serialNum;
        this.name = name;
        this.score = score;
        this.grade = whatGrade(score);
    }


    public static char whatGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score < 90 && score >= 80) {
            return 'B';
        } else if (score < 80 && score >= 70) {
            return 'C';
        } else if (score < 70 && score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void showStudentInfo() {
        System.out.println(this.studentID+this.name+this.score+this.grade);
    }
}
