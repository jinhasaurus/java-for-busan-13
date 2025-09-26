package src.day8;

public class Practice2 {
    public static void main(String[] args) {
        int num = 1;
        int danNum = 1;
        while (danNum <= 9) {
            while (num <= 9) {
                System.out.println(danNum + "*" + num + "=" + danNum * num++);
            }
        }
    }
}
