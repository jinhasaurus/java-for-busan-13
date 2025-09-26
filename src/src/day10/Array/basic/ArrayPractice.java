package src.day10.Array.basic;

public class ArrayPractice {
    public static void main(String[] args) {
        // 정수형 데이터 다섯개를 담은 배열을 선언과 동시에 초기화하세요.
        // 위 배열의 각 요소에 아래 메서드를 수행하세요.
        // 결과 또한 새로운 배열에 담아서 출력하세요.
        int score[] = {100, 78, 68, 90, 46};
        char[] results = new char[score.length]; // 새로운 문자열 배열
        for (int i = 0; i < score.length; i++) {
            results[i] = whatGrade(score[i]);
            // System.out.print (results[i]); 일케 해도 댐
        }
        for (char ch : results) {
            System.out.print(ch);
        }
    }
    // 점수를 받아 등급을 출력해주는 메서드
// paramater score 점수 (단수형 명명)
// return = 문자형 grade 결과값
    public static char whatGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score < 90 && score >= 80) {
            return 'B';
        } else if (score < 80 && score >= 70) {
            return 'C';
        } else if (score < 70 && score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
