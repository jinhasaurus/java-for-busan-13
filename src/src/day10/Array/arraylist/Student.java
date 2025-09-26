package src.day10.Array.arraylist;

import java.util.ArrayList;

public class Student {
    static int serialNum = 1000;
    private String student;
    int studentID;
    String name;
    ArrayList<Subject> subjectList;


    public Student(String student) {
        this.student = student;
    }

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
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
        System.out.println(this.studentID+this.name);
//        for (Array.arraylist.Subject s : subjectList) {
//            System.out.println(s);
    }

//    public void showStudentInfo() {
//        System.out.println(this.studentID+this.name);
//        for (Array.arraylist.Subject s : subjectList) {
//            System.out.println(s);
//        }
//    }
}
