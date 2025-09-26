package src.day3;

public class Operator3 {
    public static void main(String[] args) {
        /*
        - 연산자 우선순위
        괄호 > 단항 > 이항(산술 (곱나눗나머지 > 덧뺄셈) > 비교, 관계 > 논리 > 대입) > 삼항
        - 가독성
        그냥 괄호를 쓰거나 변수에 저장하고 코드 순서에 유의하는 것이 더 가독성이 높다 but 그때그때
         */
        // 1. 곱셈과 덧셈의 우선순위
        int result1 = 2+3*4;
        // 2+(3*4)
        System.out.println(result1);
        int result2 = (2+3)*4;
        System.out.println("result2="+result2);
        // 3. 대입연산자와 산술연산자의 우선순위
        int a = 10;
        int b = 5;
        a = b+2;
        System.out.println("a = "+a);
        // 4. 비교연산자와 논리 연산자의 우선순위
        boolean result3 = 5>3 && 2<4;
        System.out.println("result3="+result3);
        // 5. 논리 부정연산자와 비교 연산자의 우선순위
        boolean result4;
        result4 = !(5<3);
        // !(false)
        System.out.println("result4="+result4);
        // .복합표현식
        int result5 = 10 - 3 + 2 * 5 / (1+1);
        System.out.println("result5="+result5);
    }
}
