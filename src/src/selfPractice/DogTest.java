package src.selfPractice;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];

        Dog a = new Dog("몽","요크셔"); dogs[0]=a;
        Dog b = new Dog("몽2","치와와"); dogs[1]=b;
        Dog c = new Dog("몽3","진돗개"); dogs[2]=c;
        Dog d = new Dog("몽4","포메"); dogs[3]=d;
        Dog e = new Dog("몽5","시츄"); dogs[4]=e;

        for(int i = 0;i<dogs.length;i++) {
            System.out.println(dogs[i].showDogInfo());
        }
    }

}
