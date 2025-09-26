package src.day5;

public class DoWhileExample {
    public static void main(String[] args) {
        /*
        2. do-while문
        do {
            실행문; // 조건식이 참임 아니더라도 1회 실행
        } while (조건식); >> while이 만족하는 동안에 게속 실행해라.
        1회 실행되는 것을 상정하기 때문에 끝에 세미콜론 있음
         */
        int sum = 0;
        int index = 1;
        do {
            sum = index;
            index++;
        } while (index<=10);
        System.out.println("1부터 10까지의 합은"+sum+"입니다.");
    } // 일단은 실행한다가 핵심!!!
}
