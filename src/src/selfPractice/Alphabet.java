package src.selfPractice;

public class Alphabet {
    public static void main(String[] args) {

        char[][] letters = new char[13][2];
        char ch = 'a';
        int i = 0, j = 0; // 바깥에 선언


        while (i < 13) {
            letters[i][j] = ch;
            ch++;
            j++;

            if (j == 2) { // 2열 다 채우면 다음으로 가기 (행 증가)
                j = 0;
                i++;
            }
        }

        // 출력
        for (int row = 0; row < letters.length; row++) {
            for (int col = 0; col < letters[row].length; col++) {
                System.out.print(letters[row][col] + " ");
            }
            System.out.println();
        }
    }
}
