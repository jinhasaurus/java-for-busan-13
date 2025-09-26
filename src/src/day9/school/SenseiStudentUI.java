package src.day9.school;

public class SenseiStudentUI {
    public void printScoreReport(SenseiStudent a) {
        System.out.println("학번 : " + a.getStudentID() +"이름 : "+a.getName());
        System.out.println("국 : "+a.getKor()+"영 : "+a.getEng()+"수 : "+a.getMath());
    }
}
