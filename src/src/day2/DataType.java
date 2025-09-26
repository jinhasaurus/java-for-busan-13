package src.day2;

public class DataType {
    public static void main(String[] args) {
        /*
        변수 명명 타입
        AppleJuice : Pascal Case 클래스 이름 작성할 때!!
        appleJuice : Camel Case 중간에 대문자. 기본적인 변수들은 카멜로 작성해야 함!!
        apple_juice : snake case 언더바로 단어 연결.
         */
        /*
        데이터 타입 48p
        기본 자료형 >> 8가지!
            - 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte) >> 공간의 크기
            - 실수형 : float(4byte), double(8byte)
            - 논리형 : boolean(1byte) >> true or false
            - 문자형 : char(2byte) >> character
        참조 자료형 : 나즁에~
        오버 플로우 : 값이 할당한 공간보다 크게 나왔을 때. 정수형은 음수값으로 넘어가버림.
        cf. 제일 앞에 있는 게 1이 양수 0이 음수
         */

        // 정수형
        int i = 10;
        byte b = 127;
        short s = 32767;
        long l = 123456789000L; //롱으로 넣으려면 롱타입의 리터럴로 바꿔야함. >> 끝에 L붙이기! 대소문자 상관 없지만 대문자 권장.
        // b++; //증가연산자. but 딱 채워서는 표현이 안 됨! 오버 플로우. byte로 표현할 수 있는 최대값이 127
             // 표현할 수 있는 범위의 값을 넘어갔을 때 부호비트가 바뀌면서 음양수 값이 바뀜
        s++;
        // b = (byte)(b + 1);
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);

        //  실수형
        //  실수(소수점값을 가진 값) 리터럴은 기본적으로 double 타입의 리터럴로 취급
        double d = 3.14;
        float f = 3.14F; // 특별한 리터럴이 필요함. 기본적으로 더블로 취급되는데 플로트에 꾸겨넣어야 하기 때문에.
        System.out.println(d);
        System.out.println(f);
        System.out.println(0.1 + 0.2); // 0.3이 안 나옴 왜지!

        f = 3.4e38f; // 유효숫자.. 지수표현...이 뭐지  / 10의 몇 승이냐 하는 걸 e라고 함. 그게 38개
        System.out.println(f);
        System.out.println(f*10); // 실수형은 무한대의 값을 표현하게 됨
        // 넘어오는 건 오버플로우, 내려오는 건 로우플로우
        f = 1.4e-45f;
        System.out.println(f/10f);
        // 실수값 언더플로우 발생하면 0.0

        // 논리형
        boolean boo = true;
        System.out.println(boo);
        boo = i > b;
        System.out.println(boo);
        // java에서는 논리형 타입 변수에 true/false 예약어를 저장해야 한다.


    }
}
