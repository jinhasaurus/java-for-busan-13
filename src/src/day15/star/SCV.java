package src.day15.star;

public class SCV extends Terran implements Worker {
    public SCV() {
        super();
        System.out.println(name + "의 SCV가 생성되었습니다.");
    }

    @Override
    void specialSkill() {
        System.out.println("기계 수리 가능");
    }

    @Override
    public void getmineral() {
        System.out.println("SCV: 미네랄 채취");
    }

    @Override
    public void getGas() {
        System.out.println("SCV: 가스 채취");
    }

    @Override
    public void introduce() {
        // Worker.super.introduce();
        System.out.println("저는 테란 종족의 일꾼입니다.");
    }
}
