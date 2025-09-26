package src.day5;

public class WhileExample {
    public static void main(String[] args) {
        // 1. while문
        /*
        while (조건을 만족하기 위한 조건) {
            실행문;
        }

        조건은 "논리형값을 반환해야 함, 참을 반환하는 동안에"
        실행문을 반복한다
        실행 내용은 중괄호 안에 들어 있어야 한다
        while 문의 끝에는 ; 안 붙인다
        세미콜론은 어떠한 동작의 완결임
         */


        int sum =0; // 누산 결과를 담을 변수
        int index=1; // 반복회차
        while (index <= 10) {
            sum += index;
            index++;
        } // while은 확인하는 거지 실행하는 게 아님
        System.out.println("1부터 10까지의 합은"+sum+"입니다.");
    }
}
