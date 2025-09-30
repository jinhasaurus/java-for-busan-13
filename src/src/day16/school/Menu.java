package src.day16.school;

public enum Menu {
    // 이넘~
    // 서로 관련 있는 상수의 집합을 클래스처럼 사용하는 enum
    // 상수의 집합을 하나의 상수 아래에 묶어두기 위해 사용하는 것. 상수의 특성상 변하지 않음. setter필요 없다.

    /*
    상수들을 각 필드처럼, 그리고 상수들을 묶어서 하낭늬 상수처럼 사용하기 위해.
    잠점 : 오타나 잘못된 값 사용을 방지할 수 있다. / 메서드와 필드 정의 가능
     */

    //상수 목록 존재하게 하기
    CREATE(1, "등록"),
    PRINTALL(2,"전체 출력"),
    SEARCH(3, "검색"),
    DELETE(4, "삭제"),
    EXIT(5,"종료"),
    INPUT_ERROR(999, "입력 에러");


    private final int num;
    private final String description;

    // 각 상수의 속성을 초기화
    Menu(int num, String description) {
        this.num = num;
        this.description = description;
    }

    // 세터는 업다!!!
    public int getNum() {
        return num;
    }

    public String getDescription() {
        return description;
    }

    // Menu enum목록에서 특정enum을 찾아주는 메서드
    public static Menu findNum(int num) {
        for (Menu menu : Menu.values()) {
            if (menu.num == num) {
                return menu;
            }
        }
        // return null;
        return INPUT_ERROR;
    }
}
