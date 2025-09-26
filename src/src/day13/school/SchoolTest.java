package src.day13.school;

import java.util.Scanner;

public class SchoolTest {
    public static void main(String[] args) {
        //매니저 선언
        Manager m = new Manager(10);
        //
        // 스캐너 불러오기
        Scanner scan = new Scanner(System.in);

        while (true) {
            // 메뉴 선택 받기
            m.printMenu();
            int choose = scan.nextInt();
            scan.nextLine();
            switch (choose) {
                case 1:
                    m.createPerson();
                    break;
                case 2:
                    m.printAll();
                    break;
                case 3:
                    m.findPerson(); // inputName으로 따로 빼줄수도 잇음.
                    break;
                case 4:
                    m.deletePerson();
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }


    }

}

