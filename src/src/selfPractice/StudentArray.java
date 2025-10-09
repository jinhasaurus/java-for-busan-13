package src.selfPractice;

public class StudentArray {
    public static void main(String[] args) {
        Student[]students = new Student[3];

        Student a = new Student(1001,"James");
        students[0] = a;
        Student b = new Student(1002,"Tomas");
        students[1] = b;
        Student c = new Student(1003,"Edward");
        students[2] = c;

        for(int i = 0; i<students.length;i++) {
            System.out.println(students[i].showStudentInfo());
        }


    }
}
