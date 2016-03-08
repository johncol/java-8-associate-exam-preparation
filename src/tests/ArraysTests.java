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

    public static void print(int[][] matrix) {
        for (int[] row: matrix) {
            print(row);
        }
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

        int[] ints7 = {90, 78, 678, 67, 567, 456, 89, 897, 79, 56, 456};
        Arrays.sort(ints7);
        print(ints7);

        String[] ints7strings = {"3", "2", "10", "21", "1"};
        Arrays.sort(ints7strings);
        print(ints7strings);

        int index;

        int[] ints8 = {90, 78, 678, 67, 567, 456, 89, 897, 79, 56, 456};
        index = Arrays.binarySearch(ints8, 456);
        System.out.println(index);

        int[] ints9 = {90, 78, 678, 67, 567, 456, 89, 897, 79, 56, 456};
        Arrays.sort(ints9);
        index = Arrays.binarySearch(ints9, 456);
        System.out.println(index);

        int[] ints10 = {90, 78, 678, 67, 567, 456, 89, 897, 79, 56, 456};
        Arrays.sort(ints10);
        index = Arrays.binarySearch(ints10, 57);
        System.out.println(index);

        int[][] matrix = new int[2][3];
        print(matrix);

        int[][] matrix2 = {{1, 3}, {3}, {9, 8, 7}};
        print(matrix2);

        int[][] matrix3 = new int[3][];
        matrix3[0] = new int[] { 1 };
        matrix3[1] = new int[] { 2, 3 };
        matrix3[2] = new int[3];
        print(matrix3);
    }

}
