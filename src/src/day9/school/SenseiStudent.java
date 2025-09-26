package src.day9.school;

public class SenseiStudent {
    private static int serialNum = 1000;
    private final int studentID;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public SenseiStudent(String name) {
        serialNum++;
        this.studentID = serialNum;
        this.name = name;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        SenseiStudent.serialNum = serialNum;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void grantScore(int kor, int eng, int math) {
        this.setKor(kor);
        this.setEng(eng);
        this.setMath(math);
    }

}
