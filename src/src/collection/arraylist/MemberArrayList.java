package src.collection.arraylist;

import src.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    // 데이터를 묶고 효율적으로 관리하기 위해 표준화된 자료구조와 인터페이스, 구현클래스, 알고리즘을 제공하는 집합!
    private ArrayList<Member> arrayList;

    // 기본 생성자
    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    //
    public MemberArrayList(ArrayList<Member> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Member> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Member> arrayList) {
        this.arrayList = arrayList;
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int targetId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            if (member.getMemberId() == targetId) {
                arrayList.remove(i);
                return true; // 찾아서 삭제했으면 즉시 true 반환
            }
        }
        System.out.println(targetId + "가 없슴");
        return false; // 반복문을 다 돌았는데도 없으면 false 반환
    }


    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();

        // 컬렉션의 요소를 순차적으로 안전하게 접근할 수 있게 해주는 객체
        Iterator<Member> ir = arrayList.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            System.out.println(member);
        }
    }
}