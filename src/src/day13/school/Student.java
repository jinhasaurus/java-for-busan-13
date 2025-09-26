package src.day13.school;

public class Student extends Person {
    int studentID;

    public Student(String name, int age, int studentID) {
        super(name,age);
        this.studentID=studentID;
    }

    @Override
    public void printProfile () {
        System.out.println("이름 : "+name+" 나이 : "+age+" 학번 : "+studentID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
