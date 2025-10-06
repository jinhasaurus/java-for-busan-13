package src.jukebox;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JukeBox4 {
    public static void main(String[] args) {
        new JukeBox4().play();
    }

    // 주크박스가 갖고 있는 프라이빗 메서드
    private void play() {
        List<SongV3> songList = MockSongs.getSongV3s();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println("======== 정렬 작업 후 ========");
        System.out.println(songList);

        ArtistCompare artist = new ArtistCompare();
        Collections.sort(songList, artist);
        // 이렇게 써도 됨!
        songList.sort(artist);

        Comparator<SongV3> title = new TitleCompare();
        Collections.sort(songList, title);
        songList.sort(title);

        Comparator<SongV3> bpm = new DontCareName();
        Collections.sort(songList, bpm);
        songList.sort(bpm);

        // 익명 클래스 (이름 안 지어도 상관 업다..)
        songList.sort(new Comparator<SongV3>() {
            @Override
            public int compare(SongV3 o1, SongV3 o2) {
                return o1.getArtist().compareTo(o2.getArtist());
            }
        });

        // 람다 > 구현하고자 하는 인터페이스에 추상 메서드 딱 하나만 있는 경우 단일추상메서드(Single Abstract Method)
        // 문법 : songList.sort((재료1, 재료2) -> 반환할동작결과); // 임시로 사용할 변수명만 써주면 됨..
        songList.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));

        //메서드 레퍼런스 : 람다식을 간결하게 쓰기 위해 이미 존재하는 메서드를 직접 참조하는 문법
        songList.sort(Comparator.comparing(SongV3::getArtist));


    }
    // 주어진 리스트를 sort할 때 주어진 인자로 Comparator타입의 객체를 만들어 전달하면 된다.
}


class ArtistCompare implements Comparator<SongV3> {
    @Override
    public int compare(SongV3 o1, SongV3 o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
    // 멀 비교하고 있는 거지.... 머랑 멀?!?!
}

class DontCareName implements Comparator<SongV3> {
    @Override
    public int compare(SongV3 o1, SongV3 o2) {
        return o1.getBpm() - o2.getBpm();
    }
}

class TitleCompare implements Comparator<SongV3> {
    @Override
    public int compare(SongV3 o1, SongV3 o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}