package src.jukebox;

import java.util.Collections;
import java.util.List;

public class JukeBox1 {
    public static void main(String[] args) {
        new JukeBox1().play();


    }

    // 주크박스가 갖고 있는 프라이빗 메서드
    private void play (){
        List<String> songList = MockSongs.getSongStrings();
        // 출력이 되는 이유 : 리스트 자체 안에서 오버라이드 되어 있음??
        System.out.println(songList);

        //컬렉션즈가 가지고 있는 정적 메서드 sort
        //sort:정렬해주는 메서드
        Collections.sort(songList);
        System.out.println("======== 정렬 작업 후 ========");


        System.out.println(songList);
    }
}
