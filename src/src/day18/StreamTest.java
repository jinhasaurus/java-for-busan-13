package src.day18;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    //스트림 클래스
    // 자료처리 기능을 구현한 클래스
    // 컬렉션이나 배열 등의 데이터를 연속적으로 처리할 수 있게 해 주는 흐름을 제공하는 객체

    // 추상화된 연산 흐름 제공 / 선언적 방식 / 중간연산을 바로 처리하지 않고 최종연산에서 한번에 처리 / 메서드 체이닝 가능(스트림 자신을 반환)

    // 스트림 객체로 변환 -> 중간연산 -> 최종연산


    public static void main(String[] args) {
        //리스트의 팩토리메서드를 통해 불변객체 생성
        //(인터페이스 타입으로 반환되는 생성용 매서드)
        List<String> names = List.of("희연", "지원", "진하", "예은");

        //컬렉션에서 스트림 생성 : 컬렉션이 가진 스트림 메서드 통해 스트림 객체를 반환함
        Stream<String> stream1 = names.stream();

        //배열에서 스트림 생성 : 스트림 클래스에서 스트림 객체를 생성해주는 팩토리메서드
        String[] arr = {"지환", "제하"};
        Stream<String> stream2 = Stream.of(arr);

        // names를 stream객체로 만들어서 stream객체가 가지고 있는 sorted를 쓰면 자기자신을 반환.
        // 자기자신을 반환하는 메서드를 사용. 여러번 연달아서 사용할 수 있음.
        // 자기자신 반환하고 있기 때문에 순서 바뀌어도 됨

        // 1. 데이터 준비
        List<String> names2 = List.of("희연", "지원", "진하", "예은");

        List<String> result =
                // 2. 스트림 생성
                names.stream()
                        // 3. 중간연산
                        // 조건 필터링
                        // filter가 함수형 인터페이스의 구현체를 인자로 받으며 하나의 요소를 받아 참 거짓을 반환해준다
                        // -> 각 요소의 검사가 일어남
                        .filter(name -> name.length() >= 2)

                        // map이 함수형 인터페이스의 구현체를 인자로 받으며 하나의 요소를 받아 구현체의 실행문을 적용하여 결과를 반환해준다.
                        .map(String::toUpperCase)

                        // 정렬 (자연순 또는 comparator가 적용됨)
                        .sorted()

                        // 중복 요소를 제거하는 distinct연산
                        // 스트림의 연산이 적용되는 각 객체의 동일선 판단 기준으로 검사하여 시행
                        .distinct()

                        // 개수를 제한
                        .limit(2)

                        // 4. 최종연산
                        .toList();


        System.out.println(result);


        // Predicate는 1개의 제네릭 타입 인자를 받아서 boolean을 리턴하는 추상 메서드(test)를 가지고 있는 함수형 인터페이스이다.
        // Function은 입력을 받아 특정 작업을 수행한 후 출력을 반환하는 추상 메서드(apply)를 가지고 있는 함수형 인터페이스이다.

        // 주요중간연산
        /*
        filter(Preditcate) 조건에 맞는 요소만 선택
        map(Function) 요소를 변환
        distinct() 중복 제거
        sorted() 정렬 (자연순 또는 Comparator)
        limit() 최대 n개 요소 제한
        */

        //주요최종연산
        /*
        toList(), toSet(), toMap() 컬렉션으로 변환
        forEach(System.out::println) 요소 하나씩 처리 // 추가 공부 필요
        count() 요소 갯수 반환

         */

    }
}
