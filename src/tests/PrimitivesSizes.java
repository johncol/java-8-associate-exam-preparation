package tests;

public class PrimitivesSizes {

    {
        int intA = 7;
        float floatA = 4F;

        floatA = intA;
        intA = (int) floatA;

        long longA = 1;
        double doubleA = 1;

        doubleA = longA;
        longA = (long) doubleA;

        byte byteA = -128; // [-2^7 , 2^7 - 1]

        short shortA = (short) (-Math.pow(2, 15) - 1);
        System.out.println("shortA: " + shortA);

        System.out.println(Integer.MAX_VALUE);
        System.out.println((int) (Math.pow(2, 31) - 1));

        System.out.println(Integer.MIN_VALUE);
        System.out.println((int) (-Math.pow(2, 31)));
    }

    public static void main(String[] args) {
        new PrimitivesSizes();
    }

}

