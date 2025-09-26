package src.day4;

public class OperatorReview {
    public static void main(String[] args) {
        // 조건연산자 (삼항연산자)
        // 조건식 ? 참일 때 : 거짓일 때
        int dadAge = 80;
        int momAge = 77;
        String result;
        result = (dadAge > momAge) ? "아버지 나이가 더 많으심" : "어머니 나이가 더 많으심";
        if (dadAge > momAge) {
            result = "아버지 나이가 더 많으심";
        } else if (dadAge == momAge){
            result = "두 분 동갑이심";
        }
        else {
            result = "어머니 나이가 더 많으심";
            // 선택요소가 두 가지인 간단한 조건문에서는 조건연산자(삼항연산자)를 사용할 수 있다.
        }
            System.out.println(result);

    //단락회로평가 복습
    int x=1, y=0; // 참고로 0으로 나눌 수 없음
    int result1;
        if (y != 0 && (x/y > 0)){
        System.out.println("y가 0이 아닙니다");
        result1 = x/y;
        System.out.println("나눗셈 결과 : "+result1);
    } else {
        System.out.println("y가 0입니다. 나눗셈 연산을 할 수 없습니다.");
    }
    }
}

