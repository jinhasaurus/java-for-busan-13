package src.day2;

public class StrFormatting {
    public static void main(String[] args) {
        // 아스키 코드만으로 다 표현되지 않는 많은 범위의 문자 표현을 위해 유니코드 사용
        // 문자열 포맷팅
        // System.out.printf(); >>
        /* 서식 지정자를 통해 출력 형태 지정
            %d 정수 (10진법) ** decimal     cf. 8진법 o(octal), 16진법 x X (X)
            %f 실수 (float)
            %.nf 소숫점 n자리까지ㅓ     ex. %.3f
            %s 문자열 (string이라는 뜻)
         */
        String name = "훔바바";
        System.out.printf("이름은 %s입니다\n", name); // 타입이 일치하면 그대로도 출력 가능.
        System.out.printf("이름은 %5s입니다\n", name); //%ns n자리 차지하게 만들어라 cf.
        // souf는 줄바꿈 포함 안 함
        // -n도 입력 가능. 왼쪽 정렬 오른쪽 정렬 지정 가능
        System.out.printf("이름은 %-5s입니다\n", name);

        double d = 123.45678;
        int n = 1234;
        System.out.printf("d은 %6.1f이고 n은 %10d입니다\n", d, n); // %개수에 따라서 안에 몇 개 들어가는지도. 칸에 소수점도 포함

        System.out.printf("기본출력%d\n", n);
        System.out.printf("정렬출력%10d 오른쪽\n", n);
        System.out.printf("정렬출력%-10d 왼쪽\n", n);
        System.out.printf("정렬출력%010d 오른쪽정렬0채움\n",n);
        System.out.printf("실수값 포맷팅 %f\n", d); // 기본값 자체가 소숫점 6자리까지 표시하게 되어 있기 때문에 끝까지 출력, 넘으면 반올림
        System.out.printf("실수값 포맷팅 %.2f\n", d);
        System.out.printf("실수값 포맷팅 %-10.2f\n",d);
        System.out.printf("실수값 포맷팅 %10.2f\n",d);
        System.out.printf("실수값 포맷팅 %010.2f\n",d);

        int age = 20;
        String myName = "우예은";
        System.out.printf("이름: %s, 나이: %d \n", myName, age);

        System.out.println((int)'예');
        System.out.printf("\\u%04X\n",(int)'예');    //0채움 정확하게 이해하기

        //자료형 변환해야 한다........는 이야기 내일 할 거
        //리터럴을 변수에 넣을때 이전에 있었던 거는 사라지느냐?
        //변수 명명할 때 소문자 why? 상수, 상수풀, 리터럴.. 공간... 개어렵다

    }
}
