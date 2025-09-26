package src.day5;

public class LoopPractice {
    public static void main(String[] args) {
        /*
        1 2 3 4 5 6 7 8 9 10
         */
        int i1 = 0;
        while (i1 < 10) {
            i1++;
            System.out.print(i1 + " ");
        }

        // 샘 답변
        for (int ii = 1; ii <= 10; ii++) {
            System.out.print(ii + " ");
        }

        System.out.println("");
        // 0 2 4 6 8 10
        int i2 = 0;
        for (; i2 <= 10; i2++) {
            if (i2 % 2 == 0) {
                System.out.print(i2 + " ");
            }
        }

        System.out.println("");
        // 1 3 5 7 9
        int i3 = 0;
        for (; i3 < 10; i3++) {
            if (i3 % 2 == 1) {
                System.out.print(i3 + " ");
            }
        }

        System.out.println("");
        // 샘 답변
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("");
        // 샘답변2
        for (int i = 0; i <= 5; i++) {
            System.out.print(i * 2 + " ");
        }


        System.out.println("");
        // 10 9 8 7 6 5 4 3 2 1
        int i4 = 10;
        for (; i4 <= 10; i4--) {
            if (i4 >= 1) {
                System.out.print(i4 + " ");
            }
        }

        System.out.println("");
        for (int l = 10; l <= 10; l--) {
            if (l >= 0) {
                System.out.print(l + " ");
            }
        }


        System.out.println("");
        for (int l = 10; l <= 10; l--) {
            if (l >= 0) {
                System.out.print(l + " ");
            }
        }


        // 숙제
        /*
        10 20 30 40 50
        1 10 100 1000 10000

        각 출력문 3가지 연산종류(증감식, continue, break 형태) for 문으로 만들기
        각 출력문 while문으로 바꾸기
        42개 만들어오기
        for 문에 소속되어 있는 변수 i... for문 안에 있는 i는 중괄호 끝나면 사라짐
        ++ 369 만들어오기!! (다른버전)
         */
    }
}
