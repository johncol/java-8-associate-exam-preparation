package tests;

public class Operators {

    String string;

    {
        int x, y, z;

        x = 10;
        System.out.println(++x * x);

        System.out.println(11.65 % 4);

        long a = 1L + 1;
        System.out.println(a);

        float b = 1F + 1L;
        System.out.println(b);

        char c = 65;
        System.out.println(c);

        byte b1 = 1;
        byte b2 = 2;
        byte b3 = (byte) (b1 + b2);

        short c1 = 1;
        short c2 = 2;
        short c3 = (short) (c1 + c2);

        float f1 = 1F;
        double d1 = 1D;
        double rfd = f1 + d1;

        boolean boo = !false;

        int inta = 10;
        long longb = 10;

        inta = (int)(inta + longb);
        inta += longb;

        x = 10;
        y = (x = 4);
        System.out.println(x);
        System.out.println(y);

        x = Integer.MAX_VALUE;
        y = 1;
        System.out.println(x);
        System.out.println(y);
        z = x & y;
        System.out.println("&: " + z);
        z = x | y;
        System.out.println("|: " + z);
        z = x ^ y;
        System.out.println(": " + z);

        System.out.println("1: " + (false | false));
        System.out.println("2: " + (true | false));
        System.out.println("3: " + (false | true));
        System.out.println("4: " + (true | true));

        System.out.println("1: " + (false & false));
        System.out.println("2: " + (true & false));
        System.out.println("3: " + (false & true));
        System.out.println("4: " + (true & true));

        System.out.println("1: " + (false ^ false));
        System.out.println("2: " + (true ^ false));
        System.out.println("3: " + (false ^ true));
        System.out.println("4: " + (true ^ true));

        if (string != null && string.length() > 0) {
            System.out.println("if used & instead of && a NullPointerException would be thrown in string.length() > 0");
        }

        System.out.println(5 == 5.0);
        System.out.println("a" == "a");
        System.out.println(new DummyClass() == new DummyClass());

    }

    public static void main(String[] args) {
        new Operators();
    }

    class DummyClass {}

}
