package src.jukebox;

public class SongV3 implements Comparable<SongV3> {
    // 필드, 생성자, 겟터, toString()-> 타이틀만 문자열로 반환해달라
    private String title;
    private String artist;
    private int bpm;

    public SongV3(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(SongV3 o) {
        // 비교 기준을 주는 compareTo
        //0을 반환하면 두 객체가 같다는 뜻
        // 문자열은 내부적으로 이미 Comparable 구현하고 있음.
        // title은 String이므로 comparable을 구현하고 있다. 따라서 compareTo를 부를 수 있음
        return title.compareTo(o.getTitle());
    }

}
