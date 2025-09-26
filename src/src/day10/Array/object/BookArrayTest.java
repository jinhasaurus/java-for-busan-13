package src.day10.Array.object;

public class BookArrayTest {
    public static void main(String[] args) {
        //책이 다섯권 있는 도서관
        Book[] library = new Book[5];
        library[0] = new Book ("메롱","메메롱");
        library[1] = new Book ("잠와용","집");
        library[2] = new Book ("책책","책");
        library[3] = new Book ("우와","체쿠");
        library[4] = new Book ("헤헤","허걱");

        // 책 다섯권 목록 확인하기
        for (int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }

        for (Book b : library) {
            b.showBookInfo();
        }
    }
}
