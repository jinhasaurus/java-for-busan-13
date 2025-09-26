package src.day11;

public class ReferenceTypeTest {
    public static void main(String[] args) {
        String str1 = "안녕하세요";
        String str2 = "안녕하세요";
        String str3 = new String ("안녕하세요");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        Customer c = new Customer ("훔바바");
        Customer c1 = new Customer ("훔바바");
        System.out.println(c==c1);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c.equals(c1));

        // eqauls 어디서 왓냐..

    }
}
