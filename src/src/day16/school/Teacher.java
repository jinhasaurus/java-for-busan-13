package src.day16.school;

public class Teacher extends Person {
    String subject;

    public Teacher (String name, int age, String subject) {
        super(name,age);
        this.subject=subject;
    }

    @Override
    public void printProfile () {
        System.out.println("이름 : "+name+" 나이 : "+age+" 담당과목 : "+subject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }



}
