package src.day15.star;

public class Drone extends Zerg implements Worker {

    public Drone() {
        super();
        System.out.println(name+"의 드론이 생성되었습니다.");
    }


    @Override
    void specialSkill() {
        System.out.println("재생이 가능함");
    }

    @Override
    public void getmineral() {
        System.out.println("드론 : 미네랄 채취");
    }

    @Override
    public void getGas() {
        System.out.println("드론 : 가스 채취");
    }
}
