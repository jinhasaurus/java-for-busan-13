package src.day17;

// ObjectBox는 어떤 값이든 다 받아낼 수 이슴
class ObjectBox {
    Object value;

    ObjectBox(Object value) {
        this.value = value;
    }

    Object get() {
        return value;
    }

    void set(Object value) {
        this.value = value;
    }
}

public class GenericTest2 {
    public static void main(String[] args) {
        ObjectBox boi = new ObjectBox(1234);
        ObjectBox bod = new ObjectBox(12.34);

        int biv = (int)boi.get(); // 우리는 아니께 강제형번환 해버리믄 댐
        System.out.println(biv);

        double bdv = (double)bod.get();
        System.out.println(bdv);


    }
}
