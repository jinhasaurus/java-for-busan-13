package src.jukebox;

import java.util.*;

public class JukeBox5 {
    public static void main(String[] args) {
        new JukeBox5().play();
    }

    // 주크박스가 갖고 있는 프라이빗 메서드
    private void play (){
        List<SongV3> songList = MockSongs.getSongV3s();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println("======== 정렬 작업 후 ========");
        System.out.println(songList);

        //Set의 특징 중복요소 ㄴㄴ
        // hashSet의 특징 hashcode를 기준으로 일치여부 확인
        Set<SongV3> songV3Set = new HashSet<>(songList);
        System.out.println(songV3Set);

        // V3가 컴패러블 구현 중. V3가 가진 기본 정렬이 있다는 것. Treeset은 기본 정렬 함 해줌.
        Set<SongV3> songV3set1 = new TreeSet<>(songList);
        System.out.println(songV3set1);

        Set<SongV3> songV3Set2 = new TreeSet<>(Comparator.comparing(SongV3::getArtist));
        songV3Set2.addAll(songV3Set); // addAll 새 컬렉션에 기존 컬렉션 요소를 다 넣는 것
        System.out.println(songV3Set2);
    }
}
