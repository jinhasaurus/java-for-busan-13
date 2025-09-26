package src.day3;

public class TypeConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum; // 초기화 bNum의 값을 iNum에 집어넣겠다
        // 묵시적 형변환 : 바이트 크기(차지하는 메모리)가 작은 자료형에서 크기가 큰 자료형으로 자동(묵시적)으로 이루어진다.
        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;
        System.out.println(iNum2);
        System.out.println(fNum);
        // 정밀하지 않은 자료형에서 더 정밀한 자료형으로 자동으로 형 변환인 이루어진다.

        // 명시적 형변환 : 묵시적 형변환과 반대의 경우 필요함. 형변환시 데이터의 손실이 발생할 수 있다.
        int num1 = 127;
        byte num2 = (byte)num1;
        System.out.println(num1);
        System.out.println(num2); // 왜 -24가 나오노!! >> byte타입이 표현할 수 있는 값의 범위를 초과했기 때문. 오버 플로우
        // 큰 컵에서 작은 컵으로 옮겨담으려 할 때 일단 기본적으로 에러가 나옴. 형변환 연산자 얘기해주면 됨.
        // 크기가 큰 자료형에서 작은 자료형으로 대입해서 데이터 손실이 발생함

        double dNumPI = 3.94; // 반올림하지 않고 그냥 버림
        int iNum1 = (int)dNumPI;
        System.out.println(iNum1);
        // (타입) >> 일케 하는 거 변환 연산자라고 함

        double dNum1 = 1.2;
        float fNum2 = 0.9F; // F해서 실수형 리터럴로 바꿔줘야 함. 소숫점을 가진 리터럴. 무조건 더블타입으로 취급되기 때문에
        // float로 형변환 해줘야 함.
        int iNum3 = (int)dNum1 + (int)fNum2;
        System.out.println(iNum3);

        int iNum4 = (int) (dNum1 + fNum2);
        System.out.println(iNum4);
        // 형변환과 계산의 순서에 따라 결과값이 다를 수 있다.
    } //메인 메서드 끝

}//클래스 끝
