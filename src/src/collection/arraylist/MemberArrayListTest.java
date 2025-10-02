package src.collection.arraylist;

import src.collection.Member;
import java.util.Scanner;

public class MemberArrayListTest {
    // 메뉴 번호 상수 정의
    private static final int CREATE = 1;
    private static final int PRINTALL = 2;
    private static final int SEARCH = 3;
    private static final int DELETE = 4;
    private static final int EXIT = 5;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 이렇게 하는 게 맞나?
        MemberArrayList members = new MemberArrayList();

        // 멤버 ID 카운터 부여용
        int idCounter = 1; // 멤버 고유 ID 부여용

        // 멤버 생성 메뉴 & 구현
        while (true) {
            System.out.println("메뉴 번호 입력 1. 멤버 생성 2. 전체 출력 3. 검색 4. 삭제 5. 종료");
            int choice = scan.nextInt();
            scan.nextLine(); // 버퍼

            switch (choice) {
                case CREATE:
                    System.out.println("이름을 입력하세요");
                    String memberName = scan.nextLine();

                    Member member = new Member(idCounter++, memberName);
                    members.addMember(member);
                    System.out.println(memberName + " 멤버가 추가되었습니다.");
                    break;

                case PRINTALL:
                    System.out.println("전체 출력");
                    members.showAllMember();
                    break;

                case SEARCH:
                    System.out.println("검색할 이름을 입력하세요");
                    String nameSearch = scan.nextLine();

                    boolean found = false;

                    for (Member m : members.getArrayList()) {
                        if (m.getMemberName().equals(nameSearch)) {
                            System.out.println("찾음: " + m);
                            found = true;
                            break; // 찾았으니 for문 중단
                        }
                    }

                    if (!found) {
                        System.out.println("해당 이름의 멤버가 없습니다.");
                    }

                case DELETE:
                    System.out.println("삭제할 이름을 입력하세요");
                    String nameDelete = scan.nextLine();

                    for (Member m : members.getArrayList()) {
                        if (m.getMemberName().equals(nameDelete)) {
                            members.removeMember(m.getMemberId());
                            System.out.println(nameDelete + " 멤버가 삭제되었습니다.");
                            break;
                        }
                    }
                    System.out.println("해당 이름의 멤버가 없습니다.");
                    break;

                case EXIT:
                    System.out.println("프로그램 종료");
                    return;

                default:
                    System.out.println("エラー");

            }
        }
        // 렌슈
//        Member member1 = new Member(1, "지나");
//        Member member2 = new Member(2, "지나");
//        Member member3 = new Member(3, "지나");
//        members.addMember(member1);
//        members.addMember(member2);
//        members.addMember(member3);
//        members.showAllMember();

    }

}
