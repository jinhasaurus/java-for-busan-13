package src.day3;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        예제. 타수와 안타수를 입력받고 타율을 계산하세요
        출력문 >>
        타수 : 55555
        안타 : 9955
        타율 : 0.179
        1할7푼9리
        입력받은 값 저장햇다가 연산하고 연산한 걸 변환해가지고 저런 형식으로 나타내기
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("타수를 입력하세요.");
        int tasu = scan.nextInt();
        System.out.println("안타수를 입력하세요.");
        int antasu = scan.nextInt();
        double batAvg = (double)antasu/tasu; // 정수 정수 나누기 연산하면 정수값을 반환하게 됨. 예제에서 평균값은 실수이기 때문에
        // 연산의 결과를 실수화 해줘야함
        System.out.println("타수 : "+tasu);
        System.out.println("안타 : "+antasu);
        System.out.printf("타율 : %.3f\n", batAvg);
        System.out.println((int)(batAvg *1000/100)+"할"+(int)((batAvg *1000%100)/10)+"푼"+(int)(batAvg *1000%10)+"리");
        // int n1, n2, n3;
        // n1 = (int)(batAvg*10); >> 이러면 1만 나옴!! 할
        // n2 = (int)(batAvg*100)%10; >>
        // n3 = (int)(batAvg*1000)%10; >>
        // System.out.printf("%d할 %d푼 %d리", n1, n2, n3) >> %출력 d decimal 10진수
        // %n도 줄바꿈 됨
    }
}
