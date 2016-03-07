package tests;

import java.util.Arrays;

public class ArraysTests {

    public static void main(String[] args) {
        new ArraysTests();
    }

    public static void print(Object[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    {

        int[] ints1 = new int[3];
        print(ints1);

        int[] ints2 = new int[] {1, 2, 3};
        print(ints2);

        int[] ints3 = {1, 2, 3};
        print(ints3);

        int [] ints4 = new int[3];
        print(ints4);

        int ints5[] = new int[] {1, 2, 3};
        print(ints5);

        int ints6 [] = {1, 2, 3};
        print(ints6);
    }

}
