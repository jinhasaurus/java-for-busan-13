package src.day14;

// 추상 클래스로는 객체를 생성할 수 없다.
/*
추상 클래스? 미완성의 추상적인 개념을 가지는 클래스
- 미완성인 부분을 가질 수 있으며 상속 후 미완성인 부분의 완성을 강제한다.
- 필드와 일반메서드 추상메서드를 가질 수 있다.
 */

/*
상속 : 기존 클래스를 재사용하여 새로운 클래스를 만드는 것
부모 클래스의 필드와 메서드를 자식 클래스가 물려받아 사용
자식이 부모의 특성을 물려받아도 완벽히 같은 동작을 하지 않을 수 있다.(오버라이드)
코드 재사용성 즏가 / 확장성 확보 / 오버라이딩 가능
is-a 관계가 성립할 때만 사용
 */
/*
포함 : 한 클래스의 필드로 다른 클래스의 객체를 포함하는 것
has-a 관계
 */

public class AnimalTest {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.roam();
        a.food = "사료";
        a.eat(a.food);

        Lion l = new Lion();
        l.food = "생고기";
        l.makeNoise();
        l.eat(a.food);

        Cat c = new Cat();
        c.makeNoise();
    }
}

class Animal {
    String img;
    String food;
    int status;

    void makeNoise() {
        System.out.println("소리내기");
    }

    void eat(String food) {
        System.out.println("먹이 급여 : " + food);
    }

    void roam() {
        System.out.println("어슬렁거리기");
    }
}

class Lion extends Animal {
    @Override // 이건 메모임
    void makeNoise() {
        // super.makeNoise();
        System.out.println("어흥");
    }

    void eat(String food) {
        System.out.println("먹이 급여 : " + food);
    }

    void roam() {
        System.out.println("어슬렁거리기");
    }
}

class Cat extends Animal {
    @Override
    void makeNoise() {
        System.out.println("야옹");
    }

    void eat(String food) {
        System.out.println("먹이 급여 : " + food);
    }

    void roam() {
        System.out.println("어슬렁거리기");
    }
}