package src.day17;

public class Point<A extends Number, B extends Number> {
    A x;
    B y;
    // 다이아몬드 연산자 썼기 때문에 객체 생성때에도 지정해주기~

    public Point(A x, B y) {
        this.x = x;
        this.y = y;
    }

    public A getX() {
        return x;
    }

    public void setX(A x) {
        this.x = x;
    }

    public B getY() {
        return y;
    }

    public void setY(B y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
        double left = p1.getX().doubleValue();
        double bottom = p1.getY();

        Point<Integer, Double> p2 = new Point<Integer, Double>(10, 10.0);
        double right = p2.getX().doubleValue();
        double top = p2.getY().doubleValue();

        System.out.println(makeRactangle(p1, p2));

    }

    public static <A extends Number, B extends Number> double makeRactangle(Point<A, B> p1, Point<A, B> p2) {
        //Number 클래스 활용해서 타입인수 제약

        double left = (p1.getX()).doubleValue();
        double bottom = (p1.getY()).doubleValue();
        double right = (p2.getY()).doubleValue();
        double top = (double) p2.getY();

        double width = right - left;
        double height = top - bottom;

        return width * height;
    }

}
