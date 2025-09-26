package src.day4;

public class IfExample {
    public static void main(String[] args) {
        // 조건문 (분기)
        /*
        if (조건) {
            조건식이 참을 반환할 때 시행할 수행문;
        } else {
            조건식이 거짓을 반환할 때 시행할 수행문;
                }

        * 조건식 : 논리값을 반환하는 식
        > 자바에서 조건식은 반드시 논리형의 데이터를 반환하는 식이어야 한다.
        > ex. 참/거짓으로 평가되는 값... java는 안 됨!! type에 엄격한 언어.
        > 수행문이 여러 줄이면 중괄호로 묶어서 나타낸다.
        > 중괄호로 묶은 부분을 블록이라고 부른다.
         */

        int age = 2;
        if (age >= 8){
            System.out.println("학교에 다닙니다.");
        } else {
            System.out.println("학교에 안 다닙니데이");
        } // if 조건문에는 세미콜론이 붙지 않음. but 실행하는 행에는 ; 세미콜론 붙음
    }
}
