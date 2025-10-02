package src.day17;

class IntBox {
    int value;

    IntBox(int value) {
        this.value = value;
    }

    int get() {
        return value;
    }

    void set(int value) {
        this.value = value;
    }
}

class DoubleBox {
    double value;

    DoubleBox(double value) {
        this.value = value;
    }

    double get() {
        return value;
    }

    void set(double value) {
        this.value = value;
    }
}


public class GenericTest {
    //
    public static void main(String[] args) {
        IntBox bi = new IntBox(1234);
        int biv = bi.get();
        System.out.println(biv);

        DoubleBox bd = new DoubleBox(123412314);
        double bdv = bd.get();
        System.out.println(bdv);

    }
}
