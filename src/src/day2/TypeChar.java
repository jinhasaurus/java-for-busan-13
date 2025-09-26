package src.day2;

public class TypeChar {
    public static void main(String[] args) {
        /*
        - 문자
        문자를 변수에 대입하면 문자 그대로 저장되는 것이 아니라 그 숫자에 해당하는 정수값이 저장됨
         */

        char ch;
        int i;
        i = 1;
        String str;
        str = "1111"; // String은 문자열을 담을 수 있음 스트링 자체가 문자열이라는 뜻!
        ch = '1'; // 1이라는 문자 자체를 ch에 저장했음. ch는 캐릭터타입의 변수라서 ""리터럴을 담을 수 없음.
        System.out.println((int)ch); // 문자 1의 아스키 코드임
        System.out.println(ch + 1);
        System.out.println(i +1);
        System.out.println(str+1); // 오른쪽도 문자열 취급하게 됨
        // String은 문자열 연결 연산자로 바뀜

        char ch1 = 'A';
        int i1 = 65;
        System.out.println((int)ch1);
        System.out.println((char)i1);
        System.out.println((char)'가' + 1); // 홑따옴표로 감싸진 하나의 문자는 실제로 저장할 때 정수형으로 저장, 숫자연산 가능
        // 숫자연산 할 수 있고 해당하는 정수값 출력할 수 있다.
        System.out.println('C'-'A');
        System.out.println('\u0041');
        System.out.println('\n');
        System.out.println('\\'); // 역슬래시 하나만 출력은 안 됨
        System.out.println('\t'); // tap
        System.out.println('\''); // 따옴표
        System.out.println('\"');

        // 타입에 음수값은 대입할 수 없음. 정수값이 각 문자와 대응되게 되어있기 때문에 양의 정수값과 대응이 되게 되어 있다.
    }
}
