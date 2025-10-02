package src.jukebox;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    // 인터페이스 형식.. (뭐지)
    public static List<String> getSongStrings() {
        List<String> songs = new ArrayList<>();
        songs.add("Creephyp");
        songs.add("aimyon");
        songs.add("Aimyon");
        songs.add("3636");
        songs.add("<<<");
        songs.add("seasonInTheSun");
        songs.add("hehehehe");
        return songs;
    }

    public static List<SongV2> getSongV2s() {
        List<SongV2> songV2s = new ArrayList<>();
        songV2s.add(new SongV2("Creephyp","가수",100));
        songV2s.add(new SongV2("aimyon","아임용",190));
        songV2s.add(new SongV2("Aimyon","하하",200));
        songV2s.add(new SongV2("3636","묭묭",96));
        songV2s.add(new SongV2("<<<","바보바보",123));
        songV2s.add(new SongV2("seasonInThesun","집가고시퍼",333));
        songV2s.add(new SongV2("hehehehehe","hahaha",55));
        return songV2s;
    }

    public static List<SongV3> getSongV3s() {
        List<SongV3> songV3s = new ArrayList<>();
        songV3s.add(new SongV3("Creephyp","가수",100));
        songV3s.add(new SongV3("aimyon","아임용",190));
        songV3s.add(new SongV3("Aimyon","하하",200));
        songV3s.add(new SongV3("3636","묭묭",96));
        songV3s.add(new SongV3("😃","바보바보",123));
        songV3s.add(new SongV3("seasonInThesun","집가고시퍼",333));
        songV3s.add(new SongV3("hehehehehe","hahaha",55));
        return songV3s;
    }


}
