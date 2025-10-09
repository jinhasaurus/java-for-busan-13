package src.selfPractice;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogArrayList = new ArrayList<>();

        Dog q = new Dog("해피", "강아지");
        dogArrayList.add(q);
        Dog w = new Dog("해피2", "강아지2");
        dogArrayList.add(w);
        Dog e = new Dog("해피3", "강아지3");
        dogArrayList.add(e);
        Dog r = new Dog("해피4", "강아지4");
        dogArrayList.add(r);
        Dog t = new Dog("해피5", "강아지5");
        dogArrayList.add(t);

        for (Dog dog : dogArrayList) {
            System.out.println(dog.showDogInfo());
        }
    }
}
