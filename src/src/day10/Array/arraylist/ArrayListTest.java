package src.day10.Array.arraylist;

import day10.Array.object.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book b1 = new Book("책책책", "우헤헤");
        books.add(b1);
        books.add(new Book("새책", "헌책"));
        books.get(0);

        Book book = books.get(0);
        book.showBookInfo();
        b1.showBookInfo();

        // arrayList의 길이
        System.out.println(books.size());

        // array와 arrayList의 차이
        // 정해진 게 없어서 add해달라고 하면 한 만큼 자리가 늘어남
        // array는 자리가 정해져 있음.

        // 일반 for 문
        for (int i = 0; i < books.size(); i++) {
            books.get(i).showBookInfo();
        }

        // 향상된 for 문
        for (Book b : books) {
            b.showBookInfo();
        }

        // ArrayList <자료형> : 자료형의 묶음을 동절으로 저장할 수 있는 자료구조의 형태
        // 리스트이름.add(자료) : 리스트에 자료를 추가하는 메서드
        // 리스트이름.size() : 리스트의 사이즈를 반환하는 메서드
        // 리스트이름.get(인덱스번호) : 리스트의 특정인덱스에 들어 있는 값을 반환하는 메서드

    }

}
