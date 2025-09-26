package src.day5;

public class BreakContinueEx {
    public static void main(String[] args) {
        /*
        반복문에서도 브레이크 쓸 수 잇다
         */
        int sum = 0;
        int i = 0;
        for (; i < 30; i++) {
            // 1~30까지의 수 중 짝수만 누산하세요
            if (i % 2 == 1) {
                System.out.println("건너 뛰었을 때 값" + i);
                continue; // continue는 건너 뛰었을 때 다음 수행문 수행하지 않음.
            }
            //1~30까지의 누산값을 구하세요.
            // * 특정 조건에서 break
            // if (i >= 5) {
            //    break;
            // }
            System.out.println("누산한 값" + i+"누산 후 합계 "+sum);
            sum += i;
        }
        System.out.println("1부터" + i + "까지의 정수 중 짝수의 합은합은" + sum + "입니다.");
    }
}
