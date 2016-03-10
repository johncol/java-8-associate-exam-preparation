package tests;

public class Strings {

    public static void main(String[] args) {
        new Strings();
    }

    {
        System.out.println(1 + 2 + 3 + "X");
        String string, s, s1, s2;

        s1 = "s1";
        s2 = "s2";
        System.out.println(s1.concat(s2));

        s1 = "s1";
        s2 = "s1";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        s1 = "s1";
        s2 = new String("s1");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        s = "abcabc";
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a', 1));
        System.out.println(s.indexOf("ab"));
        System.out.println(s.indexOf("ab", 3));
        System.out.println(s.indexOf('X'));

        s = "animals";
        System.out.println(s.substring(3));
        System.out.println(s.substring(3, 4));
        System.out.println(s.substring(s.indexOf('m')));

        System.out.println("  aNImal  ".trim().toLowerCase().replace('a', 'A'));
        System.out.println(new StringBuilder("a").equals(new StringBuilder("a")));

    }

}
