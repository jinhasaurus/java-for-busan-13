package src.day5;

public class SwitchCase3 {
    public static void main(String[] args) {
        /*
        break가 없어도 switch-case 기본동작과 목적에 부합하게 간결하게 쓰기
        switch 표현식의 화살표 문법
        케이스 내의 실행문을 실행한 뒤 바로 문을 빠져나간다.
         */
        // switch-case문 자체를 변수에 대입하는 것임
        // 한 줄의 실행문이 되기 때문에 세미콜론 필요
        String medalColor = "gold";
        String message = switch (medalColor){
            case "gold"->"금메달입니다.";
            case "silver"->"은메달입니다.";
            case "bronze"->"동메달입니다.";
            default->{
             if ("grass" == medalColor) {
                 yield "참가상";
             }   else {
                 yield "상 없어요"; // yield ~한 조건일 때
             }
            }
        }; // 대박이당!! 이 한 줄이 실행문이 되기 때문에 세미콜론 씀.
        System.out.println(message);
    }
}
