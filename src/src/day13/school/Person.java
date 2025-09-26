package src.day13.school;

public class Person {
    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person () {
        // 디폴트 생성자 만들어주기
    }

    //기본 printProfile
    public void printProfile () {
        System.out.println("이름 : "+name+" 나이 : "+age);
    }

    // toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
