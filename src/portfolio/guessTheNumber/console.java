package portfolio.guessTheNumber;

public class console {
    public static void main(String[] args) {

        ui ui = new ui();
        ui.printStartMessage();
        while (true) {
            int choice = ui.selectStartOrFinish();
            switch (choice) {
                case 1:
                    ui.startGame();
                    int retreatChoice = ui.retreat();
                    switch (retreatChoice) {
                        case 1:
                            ui.startGame();
                        break;
                        case 2:
                            ui.finishGame();
                        break;
                        default:
                            System.out.println("1 혹은 2를 선택해주세요.");
                    }
                    break;
                case 2:
                    ui.finishGame();
                    System.out.println("게임을 종료합니다.");
                    return;
                default:
                    System.out.println("1 혹은 2를 선택해주세요."); // 기본 멘트
            }
        }
    }
}
