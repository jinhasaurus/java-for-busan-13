package src.day16.school;

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
            Menu choose = m.printMenu();
            switch (choose) {
                case CREATE:
                    m.createPerson();
                    break;
                case PRINTALL:
                    m.printAll();
                    break;
                case SEARCH:
                    m.findPerson(); // inputName으로 따로 빼줄수도 잇음.
                    break;
                case DELETE:
                    m.deletePerson();
                    break;
                case EXIT:
                    System.out.println("프로그램 종료");
                    return;
                case INPUT_ERROR:
                    System.out.println("エラー");
            }
        }


    }

}

