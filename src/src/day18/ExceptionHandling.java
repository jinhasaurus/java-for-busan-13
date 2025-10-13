package src.day18;

public class ExceptionHandling {
    // 오류? error 프로그램 코드로 처리할 수 없는 심각한 문제
    // e.g. OutOfMemoryError, StackOverFlowError

    // 예외? exception 프로그램 실행 중 정상적인 흐름을 방해하는 사건

    // 오류와 예외는 모두 Throwable 클래스를 상속. 현실적으로 개발자가 처리 가능한 것은 exception
    // 1) 컴파일 시점에 예외처리 여부를 강제하는 예외 / 2) 런타임에 발생하여 컴파일러가 강제하지 않는 예외 두 종류가 있다.
    // 1) IOException 2)SQLException  / 2) NullPointerException, ArithmeticException

    // try : 예외가 발생할 가능성이 있는 코드블록을 묶어두고
    // catch : 특정 예외가 발생한 경우를 처리하기 위한 실행문을 쓰고
    // finally : 마지막으로 예외 발생 여부와 관계 없이 항상 실행할 코드를 써서 마무리

    // throw 키워드로 예외를 직접 던짐 (강제로 예외 발생시킴)
    // throws 키워드로 메서드에서 예외 전파 (특정 메서드에 키워드를 붙여 해당 메서드 내에서 발생한 그 예외를 호출한 곳으로 떠넘김)

    // 프로그램 비정상 종료 방지 / 문제상황을 사용자에게 알림 / 자원(파일, DB 연결 등) 정리
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("예외 감지 / 처리 부분");
            System.out.println("배열의 범위를 넘어서는 인덱스를 가리켰습니다");
        } catch (NullPointerException e) {
            System.out.println("존재하지 않는 객체입니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발행하였습니다.");
        }
        finally {
            System.out.println("프로그램의 마지막에 실행");
        }
        System.out.println("이후 실행문");
        throw new RuntimeException(); // 여기서는 무조건 예외 발생
    }
}