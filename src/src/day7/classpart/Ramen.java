package src.day7.classpart;


// 클래스 = 레시피
public class Ramen {
    //멤버 변수 = 재료와 상태
    String noodleType;
    boolean hasSoup;
    boolean isCooked;


    Ramen () {

    }
    public Ramen(String type, boolean b) {
        noodleType = type;
        isCooked = b;
    }

    // 메서드 = 조리 과정
    void boilWater(){
        System.out.println("물을 끓인다...");
    }
    void addNoodles () {
        System.out.println(noodleType+"을 넣는다.");
    }
    void addSoup() {
        System.out.println("스프를 넣는다.");
    }

}
