package src.jukebox;

import java.util.Collections;
import java.util.List;

public class JukeBox2 {
    public static void main(String[] args) {
        new JukeBox2().play();
    }

    // 주크박스가 갖고 있는 프라이빗 메서드
    private void play (){
        //자동으로 암묵적으로 어쩌고 투스트링
        List<SongV2> songList = MockSongs.getSongV2s();
        System.out.println(songList);

        // 요소 타입을 바꿨을 뿐인디 정렬 못 하게 됨 ㅠㅠ
        // 문자열은 나름의 정렬 기준이 있음...
        // 자체 정의한 애는 멀 기준으로 해야할지 모름...
        // Collections.sort(songList);
        // sort 메서드가 받아내는 인자에 대한 제약..을 제네릭으로 정해둔거임 ㄷㄷ
        // Comparable을 "구현한" 클래스만 정렬할 수 있다.
        // -->> 비교 기준을 정해주는 기능이 구현되어 있어야 한다
        // Comparable<SongV2>
        System.out.println("======== 정렬 작업 후 ========");


        System.out.println(songList);
    }
}
