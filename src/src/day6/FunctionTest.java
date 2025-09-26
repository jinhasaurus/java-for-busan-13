package src.day6;

public class FunctionTest {
    public static void main(String[] args) {
        /*
        함수? 하나의 기능을 수행하는 코드 덩어리 : 한 작업을 여러 번 반복한다면 함수로 만들어두어 필요할 때마다 호출해 사용할 수 있다.
        인자 (매개변수_parameter)을 받아 결과값(반환값_return)을 반환
        전달하는 값, 전달받는 값은 메서드 선언할 때 지정된 대로. 또한 그 순서도 같아야 한다.


            public static 반환타입 함수이름 (함수가 수행할 내용에 필요한 재료) {
                함수가 수행할 내용;
                return; < 키워드 뒤의 값을 반환한다. 메서드 시그니처의 반환타입과 타입이 일치해야 한다.
            }

           * 반환치가 없다 >> void
           public static void 함수 (int n1, int n2)
           int result = n1 + n2;
           System.out.print (result);
           return result;

        헐~~ main도 함수였다
        public static <- 이 부분은 나중에. 타토에바 main 함수는 void를 반환하는 중.
         */
        /*
        main이라는 스택이 생성됨 / 수들은 상수풀에 저장됨.
        스택이 생겻다 사라졋다.............. n1 n2를 메인함수에서 불러올 수 없다.
        책 137p
         */
        System.out.println("출력문1");
        int i = 1;
        int addResult = addFunc(1, 2);
        System.out.println(addResult);
        System.out.println("출력문2");
        addResult = addFunc(4, i);
        System.out.println(addResult);
    }

    // 함수 정의
    public static int addFunc(int n1, int n2) {
        int result = n1 + n2;
        return result; // result 값을 뱉어내겟다
    }

    // 타입 다를 경우
    /*public static int addFunc2(int n3, int n4) {
        int result2 = n3 + n4;
        double PI = 3.14;
        return (int) PI;
        // result 값을 뱉어내겟다
     */
    //이렇게 정의해두면 addFunc을 이름으로 부를 수 있음

    /*
    함수로 분리하는 것의 장점
    - 가독성 향상 : 코드 덩어리가 길어지면 흐름을 이해하기 어려움.
    적절하게 분리된 메서드는 이름만 보고도 역할을 판단 가능하도록 함.
    - 유지보수 용이성 : 특정 기능을 수정하거나 디버깅 할 때 관련된 메서드만 확인하면 됨 (코드의 변경이 다른 부분에 영향을 줄 위험도 줄어듦)
    - 재사용성 증가 : 잘 분리된 메서드는 다른 클래스나 프로젝트에서도 사용 가능
    - 테스트 용이성 : 기능 단위로 테스트 가능
    - 중복 코드 제거
     */

}
