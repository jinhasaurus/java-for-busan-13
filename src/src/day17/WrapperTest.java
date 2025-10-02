package src.day17;

import src.day12.school.Person;

import java.util.ArrayList;

public class WrapperTest {
    public static void main(String[] args) {
        // Wrapper클래스? 자바의 기본자료형을 객체처럼 다룰 수 있게 해 줌
        // 기본 자료형을 담을 수 없는 상황에 객체형에 담을 수 있게

        // 기본 자료형을 래퍼 객체로 변환하는 과정
        int num = 10;
        Integer boxed = Integer.valueOf(num); // 박싱

        // Integer


        // 래퍼객체를 기본형으로 꺼내는 과정
        Integer obj = Integer.valueOf(20);
        int unboxed = obj.intValue(); // 언박싱

        Long lo = Long.valueOf(100000000000L);
        Double d = Double.valueOf(3.14);
        Byte b;
        Character ch = Character.valueOf('d');

        // 오토박싱 - 기본형 데이터가 자동으로 래퍼클래스로 변환되는 것
        int num1 = 5;
        Integer num2 = num1; // -> 오토박싱
        int num3 = num2;

        ArrayList<Person> people = new ArrayList<>();
        // ArrayList<int> nums = new ArrayList<>(); 노노 반드시 객체만 됨
        ArrayList<Integer> nums = new ArrayList<>();


        // 필요 이유
        // - 기본형 데이터를 반드시 객체로 다뤄야 하는 상황이 있음
        // - 컬렉션 프레임 워크(객체만 저장 가능함)
        // - 기본형에 없는 유틸성 메서드(래퍼 클래스의 정적 메서드) 사용 가능하다.
        // - 기본형은 값이 무조건 존재해야 하지만 객체는 값이 비어있음을 표현할 수 있다.
        int num333 = Integer.parseInt("12");

        // 숙제 : 래퍼클래스 내의 자주 쓰이는 유틸성 메서드를 찾고 코드를 작성하여 실행해보세요

        // 파싱 : 의미나 구조를 분석하여 목적에 맞게 원하는 형태로 변환하는 것




    }
}
