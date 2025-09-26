package src.day3;

public class Operator {
    public static void main(String[] args) {
        // 연산자 : 연산에 사용하는 기호
        // 항 : 연산에 사용하는 값

        /*
        연산자의 종류
        1. 대입연산자 : 우항의 값을 좌항에 대입. 따라서 좌항은 변수나 상수가 와야 한다(공간이어야 함)
        2. 산술연산자 : 사칙연산과 나머지연산. +, -, *, /, %(나머지), 문자열 연결 연산자 +, 부호연산자(단항. 피연산자가 하나엿음), 복합대입연산자
        3. 증감연산자(단항) : ++ --
        4. 비교연산자 : 크냐 작냐
        5. 논리연산자 : 참이나 거짓이냐
        6. 조건연산자
        7. 형변환연산자 : 명시적 형변환 (타입)
        8. 인스턴스연산자 : 지금은 안 함
        9. 비트연산자 ㄴㄴ
         */

        // 산술연산자
        int math = 77;
        int eng = 30;
        int totalScore = math + eng;
        System.out.println(totalScore);

        double avgScore = totalScore / 2.0; // 나눌 때 실수형으로 나누면 묵시적 형변환이 됨?
        System.out.println(avgScore);

        System.out.println(5-3);
        System.out.println(5*3);
        System.out.println(5%2); // 2로 나머지 연산. 나머지 연산을 한 결과가 0을 반환하면 짝수. 1을 반환하면 홀수.

        int originalNum = 458;
        int hundred, ten, one;
        hundred = originalNum/100; // ㅠㅠㅠ씨바 어렵다
        ten = (originalNum%100)/10; // 나머지를 반환하는 연산...
        one = (originalNum%100)%10;
        System.out.println(hundred);
        System.out.println(ten);
        System.out.println(one);

        // + 연산자의 연산자 앞에 문자열이 있으면 문자열 연결 연산자로 동작함

        System.out.println("백의 자리 수 : "+hundred);
        System.out.println("십의 자리 수 : "+ten);
        System.out.println("일의 자리 수 : "+one);

        // 줄바꿈 안 됐으면 좋겠을 수도 있음
        //println은 새 줄 print는 이어서

        System.out.print("백의 자리 수 : "+hundred);
        System.out.print("십의 자리 수 : "+ten);
        System.out.println("일의 자리 수 : "+one);

        // 부호연산자
        int i = 100;
        int minus = -100;
        System.out.println(+i);
        System.out.println(-i);
        System.out.println(+minus);
        System.out.println(-minus);

        // 연산자 써도 저장된 값이 변하지 않는다. >> 재대입이 발생하지 않는다.
        // 저장된 값을 반대 부호로 바꾸려고 하는 경우
        int num = -37;
        num = -num;
        // 재대입 하면 됨
        System.out.println(num);

        int num2 = - 87;
        num2 = num2 * -1;

        // 복합대입연산자
        // 연산자의 좌항에서 우항의 값을 ~ 해서 좌항에 대입해라
        int num3 = -323;
        num3 *= -1; // 곱해서 대입하라 *=
        System.out.println(num3); // 323
        num3 += 5;
        System.out.println(num3); // 328
        num3 -= 4;
        System.out.println(num3); // 324
        num3 /= 10;
        System.out.println(num3);
        num3 %= 10;
        System.out.println(num3);

        // 증감연산자
        int score = 80;
        int lastScore = ++score;
        System.out.println(lastScore);
        System.out.println(score);
        // 증감연산자의 특징 : 피연산자의 연산 후 재대입이 일어난다. 전위에서 증가연산하면 그 다음에 바뀜. 후위에서 하면 안 바뀐 채임.
        System.out.println(lastScore++);
        System.out.println(lastScore);
        System.out.println(--lastScore);
        System.out.println(lastScore--);
        System.out.println(lastScore);
    }
}
