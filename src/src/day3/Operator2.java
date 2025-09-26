package src.day3;

public class Operator2 {
    public static void main(String[] args) {
        /*
        4. 비교연산자 : 크냐 작냐
        5. 논리연산자 : 참이나 거짓이냐
        6. 조건연산자
        7. 형변환연산자 : 명시적 형변환 (타입)
        8. 인스턴스연산자 : 지금은 안 함
        9. 비트연산자 ㄴㄴ
         */

        int n1 = 100, n2 = 95, n3 = 80;
        boolean boo;
        boo = n1 > n2;
        System.out.println(boo);
        boo = n1 < n2;
        System.out.println(boo);
        boo = n1 >= n2;
        System.out.println(boo);
        boo = n1 <= n2;
        System.out.println(boo);
        boo = n1 == n2; // 같냐는 == 두개
        System.out.println(boo);
        boo = n1 != n2; // 다르냐는 느낌표!
        System.out.println(boo);

        // 논리연산자
        // 피연산자가 논리형이어야 함. 이항연산자.
        /*
        && : and 둘 다 참일 때 참
        || : or 둘 중에 하나라도 참이면 참 파이프 기호
        ! : not 단항연산자, 논리형 값을 반대값으로 바꿔줌
         */

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println((n1 != n2) && (n1 > n2));
        System.out.println((n1 != n2) && (n1 < n2));
        System.out.println((n1 == n2) && (n1 > n2));

        System.out.println(true || true);
        System.out.println((n1 == n2) || (n1 > n2));
        System.out.println((n1 == n2) || (n1 < n2));

        System.out.println(!(n1 > n2)); // 앞에다가 씌움
        System.out.println(!false);

        // 단락회로 평가 >> 뒤에 읽을 필요가 없다...?
        n1 = 2;
        n2 = 10;
        boo = (n1 += 10) < 10 && (n2 += 2) > 2;
        // and 앞 행에 false가 왔을 때
        // 앞에 false 반환하는 식인데 and 연산자가 왔다. 그럼 뒤에 볼 필요가 없다. 실행이 안 된다.
        System.out.println(boo);
        System.out.println(n1); // 재대입 발생해 있음
        System.out.println(n2); // 재대입 발생해있지 않음. 실행이 안 되었다는 뜻임.
        // 연산의 우선순위랑 실행여부는 다름
        // 오른쪽은 실행이 안 된다!!

        // or 연산자 앞에 true가 왔을 때
        boo = (n1 += 10) > 10 || (n2 += 2) > 2;
        // or 연산자인데 앞에 true가 왔다. 그럼 뒤에 실행이 안 된다.
        System.out.println(boo);
        System.out.println(n1); // 재대입 발생해 있음
        System.out.println(n2); // 재대입 발생해있지 않음. 실행이 안 되었다는 뜻임.
        // 논리연산자 쓸 때는 재대입이 발생하지 않도록 하기!!
        // 앞 조건에 따라서 뒤 조건을 실행할지 말지 여부를 판단할 때 유용하게 쓰임
        // 부득이하게 재대입 발생시키고 싶다면 다른 변수에 담아서 써라

        // 조건연산자 (삼항연산자)
        // 변수 = 논리형값을반환하는식 ? 참일때 : 거짓일때;
        // 논리형값을반환하는식의 결과값이 true일 때는 true값이 되고, false일 때는 전체 내용이 false가 됨.
        n1 = 3;
        n2 = 4;
        System.out.println(true? 10:20);
        System.out.println(false? 10:20);
        System.out.println(5>3? 10:20);

        int dadAge = 80;
        int momAge = 77;
        String result;
        result = (dadAge > momAge)? "아버지 나이가 더 많으심":"어머니 나이가 더 많으심";
        System.out.println(result);
    }
}
