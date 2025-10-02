package src.jukebox;

import java.util.Collections;
import java.util.List;

public class JukeBox4 {
    public static void main(String[] args) {
        new JukeBox4().play();
    }

    // 주크박스가 갖고 있는 프라이빗 메서드
    private void play (){
        List<SongV3> songList = MockSongs.getSongV3s();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println("======== 정렬 작업 후 ========");
        System.out.println(songList);
    }
}
