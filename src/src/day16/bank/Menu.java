package src.day16.bank;

public enum Menu {

    CREATE(1, "계좌 생성"),
    DEPOSIT(2, "입금하기"),
    WITHDRAW(3, "출금하기"),
    TRANSFER(4, "이체하기"),
    PRINTALL(5, "전체 출력"),
    EXIT(6, "종료");

    final int num;
    final String description;

    Menu(int num, String description) {
        this.num = num;
        this.description = description;
    }

    public int getNum() {
        return num;
    }

    public String getDescription() {
        return description;
    }

    public static Menu findNum(int num) {
        for (Menu menu : Menu.values()) {
            if (menu.num == num) {
                return menu;
            }
        }
        return null;
    }
}
