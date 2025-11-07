package portfolio.guessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class ui {
    Scanner scan = new Scanner(System.in);

    public void printStartMessage() {
        System.out.println("숫자 맞추기 게임을 시작합니다.");
        System.out.println("(번호로 선택)");
        System.out.println("1. 시작 2. 종료");
    }

    public void startGame() {
        System.out.println("1~100 사이의 숫자 중 하나를 고르고 있습니다.");
        System.out.println("고르는 중...");
        System.out.println("고르는 중......");
        System.out.println("고르는 중.........");

        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println("저는 어떤 숫자를 골랐을까요?");
        int playersChoice = scan.nextInt();
        scan.nextLine();

        while (playersChoice != randomNumber) {
            if (playersChoice <= 0 || playersChoice > 100) {
                System.out.println("1~100 사이의 숫자 중 하나를 선택해주세요.");
            } else if (playersChoice > randomNumber) {
                System.out.println("다운");
            } else {
                System.out.println("업");
            }

            System.out.println("다시 입력해주세요:");
            playersChoice = scan.nextInt();
            scan.nextLine();
        }
        System.out.println("정답입니다!");
    }

    public int retreat () {
        System.out.println("게임을 다시 시작하시겠습니까?");
        System.out.println("1. 재시작 2. 종료");
        int choice = scan.nextInt();
        scan.nextLine();
        return choice;
    }

    public int selectStartOrFinish() {
            int choice = scan.nextInt();
            scan.nextLine();
            return choice;
    }


    public void finishGame() {
        System.out.println("게임을 종료합니다.");
    }
}
