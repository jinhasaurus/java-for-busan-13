package src.day5;

public class ForPractice {
    public static void main(String[] args) {
        // 반복문 예제
        /*
        369게임 50까지
        */
        int sum = 0;
        int i = 1;
        for (; i <=50 ; i++) {
            if (i%30 ==0 || i%20 ==3 || i%20 ==6 || i%20 ==9 || i%10 ==3 || i%10 ==6 || i%10 ==9) {
                System.out.println("짝");
                continue;
            }
                else if (i%30>=1 && i%30<=10) {
                    if((i%30)%3==0){
                        System.out.println("짝짝");
                    } else {
                        System.out.println("짝");
                    }
                } else {
                System.out.println("짝");
            }
            System.out.println(i);
            sum += i;
        }

    }
}
