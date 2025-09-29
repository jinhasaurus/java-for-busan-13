package src.day15.star;

public class Main {
    public static void main(String[] args) {
        SCV s = new SCV();
        s.specialSkill();
        s.getmineral();
        s.getGas();
        s.introduce();

        Drone d = new Drone();
        d.specialSkill();
        d.getmineral();
        d.getGas();
        d.introduce();

        Prove p = new Prove();
        p.specialSkill();
        p.getmineral();
        p.getGas();
        d.introduce();
    }
}
