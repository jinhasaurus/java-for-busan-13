package src.day11;

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