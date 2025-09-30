package src.day16.string;

public class StringBufferTest {
    public static void main(String[] args) {
        String str = "String ";
        long startedTime;
        int lasting = 100000;

        // 문자열 객체의 리터럴은 상수풀 내의 StringPool에 저장된다.
        // 단순 문자열 연결 연산 (-> 메모리 낭비가 크다, 시간 소모가 많다)
        String newStr = "";
        startedTime = System.currentTimeMillis(); // 기준 시간

        // 특정 횟수동안 반복
        for (int i = 0; i < lasting; i++) {
            newStr += str;
        }
        System.out.println("문자열 연결" + (System.currentTimeMillis() - startedTime));

        //StringBuffer
        StringBuffer buffer = new StringBuffer();
        startedTime = System.currentTimeMillis(); // 기준 시간 재할당

        // StringBuffer/StringBuilder는 문자배열(객체) 형태로 저장한다.
        // 내부 배열을 확장해가며 연산... 먼 소리지

        for (int i = 0; i < lasting; i++) {
            buffer.append(str);
        }
        System.out.println("StringBuffer로 연결" + (System.currentTimeMillis() - startedTime));



        // 문자열 총 길이를 안다면 초기 용량으로 지정해서 선언
        // (배열 확장을 하지 않으므로 더 빠름)
        int bufferSize = str.length()*lasting;
        // 선언할 때 사이즈 할당해주면 됨
        StringBuffer buffer2 = new StringBuffer(bufferSize);
        startedTime = System.currentTimeMillis(); // 기준 시간 재할당

        for (int i = 0; i < lasting; i++) {
            buffer.append(str);
        }
        System.out.println("StringBuffer로 연결(" + bufferSize + ")" + (System.currentTimeMillis() - startedTime));


        // StringBuffer은 멀티 스레드에 안전하다. 동시에 다른 곳에서 접근하게 되면 변경 가능한 객체는 값을 안전하게 보존하기 어렵.
        // StringBuilder가 안정성 있으면서... 어쩌고...?

    }
}
