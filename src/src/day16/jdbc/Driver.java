package src.day16.jdbc;

public class Driver {
    Query q;

    Driver() {
        q = new MySQL();
    }

    public Query getQuery() {
        return q;
    }


}
