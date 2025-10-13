package src.day18;

public class LambdaTest {
    // 람다? 메서드를 하나의 식(식별자 없는 함수)으로 표현한 것
    public static void main(String[] args) {
        int[] nums = {29, 41, 23, 43, 30, 28, 11, 23, 54, 22, 12};

        NumFilter over30 = new FilterOver30();
        System.out.println("30세 이상인 사람 수 : " + check(over30, nums));

        NumFilter under20 = new FilterUnder20();
        System.out.println("30세 이상인 사람 수 : " + check(under20, nums));

        System.out.println("30세 이상인 사람 수 : "+check(new NumFilter() {
            @Override
            public boolean numCheck(int a) {
                return a >= 30;
            }
        }, nums));

        NumFilter filter = a -> a>30;
        System.out.println("30세 이상인 사람 수 : "+check(over30,nums));
        System.out.println("30세 이상인 사람 수 : "+check(a -> a>30,nums));
        System.out.println("10세 미만인 사람 수 : "+check(a -> a<10, nums));



    }

    // 정적 메서드
    static int check(NumFilter filter, int[] data) {
        int num = 0;
        for (int age : data) {
            if (filter.numCheck(age)) num++;
        }
        return num;
    }

    static class FilterOver30 implements NumFilter {
        public boolean numCheck(int a) {
            return a >= 30;
        }
    }

    static class FilterUnder20 implements NumFilter {
        public boolean numCheck(int a) {
            return a < 20;
        }
    }


    interface NumFilter {
        boolean numCheck(int a);
    }
    }