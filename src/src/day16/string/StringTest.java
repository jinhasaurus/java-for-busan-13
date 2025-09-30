package src.day16.string;

public class StringTest {
    public static void main(String[] args) {
        // 문자열은 메모리 영역의 상수풀 내 stringPool에 저장된다

        // 문자열 타입의 객체
        String str1 = new String("abc");
        String str2 = new String("abc");

        //주소값 일치여부 검사
        System.out.println(str1 == str2);

        //문자열에 equals는 값이 일치하면 일치...
        System.out.println(str1.equals(str2));


        //문자열 리터럴로 선언
        String str3 = "abc";
        String str4 = "abc";

        // 문자열 리터럴은 상수풀 내 stringPool에 저장됨.
        // heap에 같은 문자열 가리키게 되기 때문에. 같은 걸 가리키고 있다고 하게 됨!!
        // 같은 객체 자체를 할당하도록 동작하게 됨
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        // 서식지정문자열.formatted()
        String studentInfo = """
                %s 님은
                %d학년입니다. 
                평점은 %.1f입니다.
                """.formatted("jinha", 1, 3.5); // 텍스트 블록
        System.out.println(studentInfo);

        // concat 메서드
        // 호출 주체인 문자열을 재료 문자열과 연결한다.
        String hello = "hello";
        String world = "World";
        String message = hello.concat(world);
        System.out.println(message);

        // String 클래스의 메서드 이로이로 탐색하고 한번 써보고 오기..~

        // System.identityHashCode() -> 매번 새로운 객체가 되어 메모리를 차지하게 되는 것을 알 수 있따.
        // 문자열 객체는 불변임!!! 메모리 낭비 심하다.
        // 세 문자열 객체 주소 다 다름
        System.out.println(System.identityHashCode(hello));
        System.out.println(System.identityHashCode(world));
        System.out.println(System.identityHashCode(message));

        // String / Stringbuffer / Stringbuilder의 차이

    }
}
