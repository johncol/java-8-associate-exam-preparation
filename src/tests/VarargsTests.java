package tests;

import java.util.Arrays;

public class VarargsTests implements Utils{

    public static void main(String[] args) {
        new VarargsTests();
    }

    static void print(int... nums) {
        if (nums != null) {
            Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
            System.out.println();
        } else {
            System.out.println("null input");
        }
    }

    static void printObjects(Object... objects) {
        if (objects != null) {
            Arrays.stream(objects).forEach(x -> System.out.print(x + " "));
            System.out.println();
        } else {
            System.out.println("null input");
        }
    }

    static String getNull() {
        return null;
    }

    {
        print(1, 2);

        print(new int[] {1, 2, 3});

        int[] nums = {1, 2, 3, 4};
        print(nums);

        print(null);
        separator();
    }

    {
        printObjects("a", "b", "c");

        printObjects(null, null, null);

        printObjects(null);

        String s1 =  null;
        printObjects(s1);

        Object s2 =  null;
        printObjects(s2);

        String s3 = getNull();
        printObjects(s3);

        printObjects(getNull());
    }

}
