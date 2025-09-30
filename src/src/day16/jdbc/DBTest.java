package src.day16.jdbc;

public class DBTest {
    public static void main(String[] args) {
        Driver db = new Driver();
        Query sql = db.getQuery(); // 쿼리 타입의 객체를 반환
        System.out.println(sql.selectQuery());
        // 타db로의 이행이 쉬워진다!!
    }
}
