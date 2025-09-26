package src.day11;

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {
        ArrayList<Shape> sList = new ArrayList<>();
        Circle c = new Circle ();
        c.draw();
        Shape s = new Shape();
        Rectangle r= new Rectangle();
        Triangle t = new Triangle();

        sList.add(s);
        sList.add(c);
        sList.add(r);
        sList.add(t);

        for (Shape shape : sList) { // 모두 Shape타입으로 꺼내서 호출하면
            shape.draw(); // 오버라이딩된 함수가 호출됨
        }

        // 형변환해서 다른 매서드? 불러오기...
        // 자식클래스의 타입을 확인하고 강제캐스팅 (형변환 = 캐스팅)
        for (Shape shape : sList) { // 모두 Shape타입으로 꺼내서 호출하면
            if (shape instanceof Circle) { // 일단 shape타입으로 꺼낸 요소가 어떤 타입의 인스턴스인지 확인
                Circle circle = (Circle)shape;
                circle.print();
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.print();
            } else {
                System.out.println("지원되지 않는 타입이에여");
            }
        }


        System.out.println(c instanceof Circle); // c가 Circle의 인스탄스 연산자냐 묻는 연산자
        System.out.println(c instanceof Shape); // 부모 클래스의 인스턴스냐 물어보면 맞다 함
        System.out.println(s instanceof Triangle); //
    }
}

class Shape {
    void draw() {
        System.out.println("그린다");
    }
}

// Override : 매서드 이름, 매개변수 목록, 반환 타입을 보고 상위 매서드를 오버라이드하는지 자동 판단 함.
// Override 써주면 컴파일러가 잘 확인해준다.
class Circle extends Shape {
    @Override
    void draw () {
        System.out.println("draw circle");
    }
    void print () {
        System.out.println("원입니다.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw () {
        System.out.println("draw rectangle");
    }
    void print () {
        System.out.println("사각형입니다.");
    }
}

class Triangle extends Shape {
    @Override
    void draw () {
        System.out.println("draw triangle");
    }
    void print () {
        System.out.println("삼각형입니다.");
    }
}
