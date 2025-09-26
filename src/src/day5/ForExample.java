package src.day5;

public class ForExample {
    public static void main(String[] args) {
        /* 3. For문
        For (초기화식;조건식;증감식) {
            실행문;
        } 순서: 초기화는 0번째 / 조건식 만족하면 실행문 수행 / 실행문 수행하면 증감식 수행 / 다시 조건식 검증
         */
        int sum = 0;
        int i = 0; // 초기화값이 바깥으로 나가도 된다.
        for (; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1에서 10까지의 합은" + sum + "입니다.");


        int l = 0;
        for (; ; l++) {
            if (l <= 10) {
                System.out.println("멈추는 조건");
                break;
            }
        }

/*        int sum1 = 1;
        int index = 1;
        while (true) {
            sum += index;
            index++;
            System.out.println("1부터 10까지의 합은"+sum+"입니다.");
            무한반복
            }
 */
    }
}


// For문 괄호 안의 세 요소()모두 생략가능하다
/*
초기화식 : 반복 전에 이미 초기화된 변수를 사용하는 경우 생략 가능
조건식 : 반복을 중간에 멈추고자 할 때, 조건을 블록 내의 제어문(if, break) 등으로 처리하면 조건식을 생략할 수 있다.
증감식 : 증ㄱ마식이 복잡하거나 다른 변수의 상태에 따라 달라질 경우, 증감 처리를 블록 안에서 직접 수행할 수 있다.
 */


