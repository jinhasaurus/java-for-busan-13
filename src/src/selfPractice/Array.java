package src.selfPractice;

public class Array {
    public static void main(String[] args) {
        // 소문자 출력
        char[] alphabets = new char[26];
        char ch = 'a';

        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }

        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i] + "," + (int) alphabets[i]);
        }


        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < numbers.length; ) {
            for (int num = 1; num <= 10; num++) {
                if (num %2==0) {
                    numbers[i] = num;
                    i++;
                    sum += num;
                }
            }
        }

        System.out.println(sum);



    }
}
