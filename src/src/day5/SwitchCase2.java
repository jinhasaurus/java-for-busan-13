package src.day5;

public class SwitchCase2 {
    public static void main(String[] args) {
        String medalColor = "gold";
        switch (medalColor){

            case "gold":
                System.out.println("금메달입니다.");
                break;

            case "silver":
                System.out.println("은메달입니다.");
                break;

            case "bronze":
                System.out.println("동메달입니다.");
                break;

            default:
                System.out.println("참가상");

        }

    }
}
