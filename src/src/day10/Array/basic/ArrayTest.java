package src.day10.Array.basic;

public class ArrayTest {
    public static void main(String[] args) {
     // 배열 : 같은 자료형을 가진 자료 여러 개를 묶어서 관리
     int[] numbers;
     int[] nums = {1,2,3}; // 배열 선언과 초기화
     int[] nums1 = new int[3]; // 배열은 고정사이즈를 갖는다 (초기화 당시에 정해짐)

    // 배열 생성 시 주의할 패턴
        // int[] numsErr;
        // numsErr = {1,2,3}; // 이미 선언된 배열을 가리켜 직접 넣어주기
        // numsErr[0] = 1; // 실체가 존재하지 않아서.. 먼 말이고
        // int[] numsErr2 = new int[3] {1,2,3}; // 칸 정하기 + 초기화하기 동시에 안 됨. 충돌할 수도 있으니까
        // int[] nums3 = new int[] {1,2,3,4}; // 는 됨

        int[] numsOK;
        numsOK = new int [3]; // 배열은 생성시 무조건 칸 수 지정.
        numsOK[0] = 1;        // 1번째가 아니라 0번째부터...
        numsOK[1] = 2;        // 1번째가 아니라 0번째부터...
        numsOK[2] = 3;        // 1번째가 아니라 0번째부터...
        System.out.println(numsOK[0]);
        System.out.println(numsOK[1]);
        System.out.println(numsOK[2]);
//        System.out.println(numsOK[3]); 정해진 범위 벗어나서 에러난다
        // System.out.println(numsOK[-1]); 배열의 인덱스에 음수값을 지정할 수 없다.
        System.out.println(numsOK.length); // 배열 객체의 길이(-1 해서 생각하믄 됨)

        System.out.println("일반 for문으로 요소 한 개씩 출력");
        for (int i = 0; i<numsOK.length; i++) {
            System.out.println(numsOK[i]);
        }

        // 향상된 forLoop
        /*
        for (자료형 각요소를가리킬변수명: 배열이름) {
            수행문;
            }
         */
        System.out.println("향상된 for문으로 요소 한 개씩 출력");
        for (int j : numsOK) {
            System.out.println(j);
        }
    }
}