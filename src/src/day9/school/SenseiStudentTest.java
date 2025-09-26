package src.day9.school;

public class SenseiStudentTest {
    public static void main(String[] args) {
        SenseiStudentUI ui = new SenseiStudentUI();
        // 학생 한 명 (기본 정보만 생기고, 점수 없는 상태)
        SenseiStudent a1 = new SenseiStudent("키무상");
        // a1.name = "파쿠상";
        // 학생에게 점수 부여
//        a1.setKor(99);
//        a1.setEng(88);
//        a1.setMath(77);
        a1.grantScore (99,88,77);
        ui.printScoreReport(a1);

        SenseiStudent s2 = new SenseiStudent ("fl tkd");

    }
}
