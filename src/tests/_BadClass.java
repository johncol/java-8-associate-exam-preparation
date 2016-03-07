package tests;

/**
 * Created by johcely on 2/17/16.
 */
public class _BadClass {

    private static int $;

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb = new StringBuilder();
        sb.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb.toString() == s1);
        System.out.println(sb.toString().equals(s1));
    }

}
