package src.day15.star;

public class Prove extends Protoss implements Worker {
    public Prove() {
        super();
        System.out.println(name+"의 프로브가 생성되었습니다.");
    }


    @Override
    void specialSkill() {
        System.out.println("쉴드가 가능함");
    }


    @Override
    public void getmineral() {
        System.out.println("프로브 : 미네랄 채취");
    }

    @Override
    public void getGas() {
        System.out.println("프로브 : 가스 채취");
    }
}
