package src.day12.school;

import java.util.Objects;

public class Person {
    // 이름
    String name;
    // 나이
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printProfile() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Person)) {
            Person person = (Person) o;
            return name.equals(person.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
