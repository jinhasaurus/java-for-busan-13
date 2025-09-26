package src.day7.classpart;

public class Kitchen {
    public static void main(String[] args) {
        Ramen spicyMen = new Ramen ();
        spicyMen.noodleType = "꼬불면";
        spicyMen.boilWater();
        spicyMen.addNoodles();
        spicyMen.addSoup();
        spicyMen.isCooked = true;

        Ramen plainMen = new Ramen("순한면", false);
    }
}
