package src.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    String name;
    int studentID;
    int score;

    public Student(String name, int studentID, int score) {
        this.name = name;
        this.studentID = studentID;
        this.score = score;
    }

    public static void main(String[] args) {
        //학생 배열 리스트 제작
        ArrayList<Student> studentArrayList = new ArrayList<>();

        // 학생 선언
        Student a = new Student("진하", 1000, 100);
        Student b = new Student("진하2", 1001, 90);
        Student c = new Student("진하3", 1002, 80);
        Student d = new Student("진하4", 1003, 70);

        // 배열 리스트에 학생 추가
        studentArrayList.add(a);
        studentArrayList.add(b);
        studentArrayList.add(c);
        studentArrayList.add(d);

        System.out.println("학생 검색 시작");
        // 스캐너 추가
        Scanner scan = new Scanner(System.in);
        System.out.println("학생의 이름을 입력해주세요.");

        String searchName = scan.nextLine();
        boolean found = false;

        for (Student s : studentArrayList) {
            if (s.name.equals(searchName)) {
                System.out.println(s);
                found = true;
                break;
            }
        }

        // 정렬 전
        System.out.println("정렬 전:");
        for (Student s : studentArrayList) {
            System.out.println(s);
        }

        Collections.sort(studentArrayList);

        // 정렬 후
        System.out.println("\n정렬 후 (점수 오름차순):");
        for (Student s : studentArrayList) {
            System.out.println(s);
        }

        if (!found) {
            System.out.println("해당 이름의 학생을 찾을 수 없습니다.");
        }


    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return studentID == student.studentID && score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentID, score);
    }

    @Override
    public String toString() {
        return "학생 이름 : " + name + " 학번 : " + studentID + " 점수 : " + score;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.score, other.score);
    }
}