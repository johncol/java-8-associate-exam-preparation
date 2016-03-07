package tests;

public class StringBuilderTests {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("world").insert(0, "hello ");

        System.out.println(s);
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("world"));
        System.out.println(s.length());
        System.out.println(s.substring(5));

        s.deleteCharAt(0);
        System.out.println(s);

        s.delete(5, 6);
        System.out.println(s);

        System.out.println(s.reverse());
    }

}
