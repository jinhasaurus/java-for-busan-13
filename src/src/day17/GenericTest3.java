package src.day17;

// ObjectBox는 어떤 값이든 다 받아낼 수 이슴
// T는 타입인수를 의미, T가 아닌 다른 문자를 사용해도 상관 없음
// 인수의 의미에 따라 다른 한 글자 알파벳 대문자를 사용
// T:Type, E:Element, K:Key, V:Value N:Number 등
// 관습적 부분

class Box<T> {
    T value;
    // 필드임
    // 타입인수 받아쓰는 필드는 static이면 안 됨
    // static이 안 붙어있어야 instance단위로 다른 값을 가질 수 있게 됨
    // 고정되면 안 됨!!

    Box(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    void set(T value) {
        this.value = value;
    }
}

public class GenericTest3 {
    public static void main(String[] args) {
        // 제네릭이란? 클래스, 인터페이스, 메서드에서 다루는 데이터타입을 필요에 따라 여러 자료형으로 바꿀 수 있게 하여
        // 프로그램의 유연성을 향상시키는 자바 문법.
        // -> 타입을 나중에 결정할 수 있게 만들어 둔 틀
        // -> 타입 안정성을 높이고 캐스팅을 줄이고 재사용성을 높임

        // 다이아몬드 연산자 안에 들어가는 T: 타입은 Box 타입의 인스턴스가 생성될 때 결정됨
        Box<Integer> boi = new Box<>(1234); // Integer 타입의 객체 저장하는 리모콘 bi, 새 객체 1234

        Box <Double> bod = new Box<>(12.34);

        int biv = boi.get();
        System.out.println(biv);

        double bdv = bod.get();
        System.out.println(bdv);


    }
}
