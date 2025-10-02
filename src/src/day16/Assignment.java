package src.day16;

public class Assignment {
    public class StringExample {
        public static void main(String[] args) {
            String str = " Hello Java ";

            // 1. 문자열 길이
            System.out.println("길이: " + str.length());
            // 출력: 길이: 12

            // 2. 특정 문자 가져오기
            System.out.println("3번째 문자: " + str.charAt(2));
            // 출력: 3번째 문자: l

            // 3. 부분 문자열 추출
            System.out.println("부분 문자열: " + str.substring(1, 6));
            // 출력: 부분 문자열: Hello

            // 4. 문자열 포함 여부
            System.out.println("Java 포함?: " + str.contains("Java"));
            // 출력: Java 포함?: true

            // 5. 공백 제거
            System.out.println("trim(): [" + str.trim() + "]");
            // 출력: [Hello Java]

            // 6. 대소문자 변환
            System.out.println("대문자: " + str.toUpperCase());
            // 출력: HELLO JAVA
            System.out.println("소문자: " + str.toLowerCase());
            // 출력: hello java

            // 7. 문자열 치환
            System.out.println("치환: " + str.replace("Java", "World"));
            // 출력:  Hello World

            // 8. 시작/끝 확인
            System.out.println("Hello로 시작?: " + str.trim().startsWith("Hello"));
            // 출력: true
            System.out.println("ava로 끝?: " + str.trim().endsWith("ava"));
            // 출력: true

            // 9. 문자열 분할
            String[] arr = str.trim().split(" ");
            System.out.println("split 결과:");
            for (String s : arr) {
                System.out.println(s);
            }
            // 출력:
            // Hello
            // Java

            // 10. equals (내용 비교)
            String str2 = " hello java ";
            System.out.println("같은 문자열인가? " + str.equals(str2));
            // 출력: false
            System.out.println("대소문자 무시 비교: " + str.trim().equalsIgnoreCase(str2.trim()));
            // 출력: true
        }
    }



}
