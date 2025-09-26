package src.day12.school;

public class Teacher extends Person {
    // 과목
    String subject;

    public Teacher (String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    @Override
    public void printProfile() {
        System.out.println("이름 : "+name+" 나이 : "+age+" 담당 과목 : "+subject+" 선생입니다.");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

