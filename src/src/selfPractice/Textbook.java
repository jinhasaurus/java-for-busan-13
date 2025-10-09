package src.selfPractice;

public class Textbook {
    public static void main(String[] args) {
        //변수 두 개를 선언해서 10과 2.0을 대입하고, 두 변수의 사칙 연산 결과를 정수로 출력해 보세요.

        int a = 10;
        double b = 2.0;

        System.out.println(a + (int) b);

        //‘글’이라는 한글 문자의 유니코드값을 찾아서 char형으로 선언한 변수에 저장한 뒤, 그 변수를 출력하여 확인해 보세요.
        char ch = '글';
        int unicode = (int) ch;
        System.out.println(ch + "의 유니코드 값은" + unicode + "입니다.");


        // operator값이 +, -, *, /인 경우에 사칙연산을 수행하는 프로그램을 if-else문과 switch-case문을 사용해 작성해 보세요.
        int num1 = 10;
        int num2 = 2;
        char operator = '+';
        switch (operator) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
        }

//        // 구구단 짝수단만 출력
//        for (int danNum = 1; danNum < 10; danNum++) {
//            if (danNum % 2 != 0) {
//                continue; // 홀수면 아래 코드 무시하고 다음 반복으로
//            }
//            for (int gopNum = 1; gopNum < 10; gopNum++) {
//                System.out.println(danNum + " * " + gopNum + " = " + (danNum * gopNum));
//            }
//        }

        // 구구단을 단을 곱하는 수보다 작거나 같은 경우 까지만 출력
        for (int danNum2 = 1; danNum2 < 10; danNum2++) {
            for (int gopNum2 = 1; gopNum2 <= danNum2; ) {
                System.out.println(danNum2 + " * " + gopNum2 + " = " + (danNum2 * gopNum2));
                gopNum2++;
            }
        }

        // 삼각형 출력
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  "); // 공백 출력
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 다이아몬드 출력
        rows = 5;

        // 윗부분
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아랫부분
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        rows = 5;

        System.out.println("=== 윗부분 디버깅 시작 ===");
        for (int i = 0; i < rows; i++) {
            System.out.println("윗줄 i = " + i);

            // 공백 출력
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
                System.out.print("(j=" + j + ")"); // 공백 디버깅
            }

            // 별 출력
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
                System.out.print("(k=" + k + ")"); // 별 디버깅
            }

            System.out.println(); // 줄바꿈
        }

        System.out.println("=== 아랫부분 디버깅 시작 ===");
        for (int i = rows - 2; i >= 0; i--) {
            System.out.println("아랫줄 i = " + i);

            // 공백 출력
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
                System.out.print("(j=" + j + ")"); // 공백 디버깅
            }

            // 별 출력
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
                System.out.print("(k=" + k + ")"); // 별 디버깅
            }

            System.out.println(); // 줄바꿈
        }

        System.out.println("=== 디버깅 끝 ===");


    }
}
