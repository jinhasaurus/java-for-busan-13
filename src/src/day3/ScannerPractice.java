package src.day3;
// 스캐너 도구 쓰려면 경로를 지정해줘야 함. 패키지와 클래스 사이에!

import java.util.Scanner;
// 입력 받는 동작을 할 수 있는 도구를 가져올 매장이름 알려주기


public class ScannerPractice {
    public static void main(String[] args) {
        // java의 표준 입출력
        /*
        표준입력 : 사용자의 입력을 받는 기능 (System.in)
        표준출력 : 프로그램이 결과를 출력하는 기능 (System.out)
         */
        Scanner scan = new Scanner(System.in); // 통째로 기억하기
        // 도구를 집에서 쓸 때 부를 이름 정하기 = 매장에서 새 도구 구입하기
        // >> 이렇게 쓰면 입력받을 수 있게 된다.
        // 클래스 가져오기를 눌러도 된다....
        System.out.print("이름을 입력하세요: ");
        String name = scan.nextLine(); // 입력받는 동작을 할 수 있게 됨!! 입력하고 엔터 치면 동작 끝. 문자열 입력

        // char 입력받기
        // System.out.println(name.charAt(0)); n번째 캐릭터를 가리키는 스트링..문자열 객체.. 먼..소리지
        // char ch = name.charAt(0); >> chatAt(n번째 글자를 꺼내라)

        System.out.println(name);
        System.out.print("나이를 입력하세요: ");
        int age = scan.nextInt();
        System.out.println(age);
        System.out.println("안녕하세요, "+name+"님. 나이는 "+age+"세 이시군요 ^^.");
        //nextInt는 엔터를 쳐도 버퍼에 남아 있음. 그 다음 입력받기 기능을 마주치면 들어감.
        // 엔터 치면 nextLine 종료됨. 그래서 빈 문자열이 newName에 들어가고 끝나버림.
        // 줄바꿈 문자를 바로 읽어버림 -> 입력 안 받음
        // nextInt(); 얘는 숫자만 읽음 줄바꿈은 안 먹음 nextInt다음에 비어있는 nextLine 하나를 마련해줘야 의도한대로 동작할 것.
        // 비어있는 nextLine 하나 해서 버퍼에 남은 줄바꿈을 제거해줘야 함.
        System.out.println("새 이름:");
        String newName = scan.nextLine();

        scan.close();
        // 전원 꺼주장. 리소스 해제
    }
}
