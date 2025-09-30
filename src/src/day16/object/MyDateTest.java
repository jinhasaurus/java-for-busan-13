package src.day16.object;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2025, 9, 30);
        MyDate d2 = new MyDate(2025, 9, 30);

        //equals가 참일 때 hashocode 일치여부는 부조건 참이어야 하고 hashcode 일치여부가 참이어도 (해시충돌)
        //equals는 거짓(실제 주소 일치 여부)일 수 있음

        // 일치연산자는 실제 메모리 주소를 비교
        System.out.println(d1 == d2);

        // toString의 암묵적 호출 결과를 출력함

        System.out.println(d1);
        // 출력결과가 같은 이유는 hashcode를 재정의했기 때문
        // toString()미오버라이드 -> 클래스명@hashcode(16진수) 출력 -> 값이 같아보이는 이유는 우리가 hashcode()를 동일하게 나오게끔 구현했기 때문
        System.out.println(d2.toString());
        System.out.println(d1.equals(d2));

        // 실제 주소 확인하는 방법
        System.out.println(System.identityHashCode(d1));
        System.out.println(System.identityHashCode(d2));
    }
}