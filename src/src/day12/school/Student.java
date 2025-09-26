package src.day12.school;

public class Student extends Person {
    //학번
    int studentID;

    public Student(String name, int age, int studentID) {
        // super(); 그냥 슈퍼 쓰면 안 됨!!!!
        // 슈퍼 쓸 거면 Person에도 생성자 만ㄷ르기... 그리고 super(name, age); 하기 ...

        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void printProfile() {
        System.out.println("이름 : "+name+" 나이 : "+age+" 학번 : "+studentID+" 학생입니다.");
    }

}
