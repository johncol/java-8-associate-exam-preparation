package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        new ArrayLists();
    }

    {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add(0, "b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        System.out.println(list);

        System.out.println(list.remove("a"));
        System.out.println(list);

        System.out.println(list.remove("x"));
        System.out.println(list);

        System.out.println(list.remove(0));
        System.out.println(list);

        System.out.println(list.set(0, "C"));
        System.out.println(list);

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.clear();
        System.out.println(list);

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println(list.contains("a"));
        System.out.println(list.contains("x"));

        System.out.println();
        List<String> listA = new ArrayList<>();
        listA.add("a");
        listA.add("b");

        List<Object> listB = new ArrayList<>();
        listB.add("a");
        listB.add("b");

        System.out.println(list.equals(listB));
        System.out.println(listA.equals(listB));

        System.out.println();
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println(integers);
        System.out.println(integers.remove(1));
        System.out.println(integers);

        System.out.println();
        integers.clear();
        integers.add(1);
        integers.add(2);
        System.out.println(integers);
        System.out.println(integers.remove(new Integer(1)));
        System.out.println(integers);

        System.out.println();
        list = Arrays.asList("a", "b", "c");
        System.out.println(list);
        String[] strings = list.toArray(new String[0]);
        System.out.println(Arrays.toString(strings));

        System.out.println();
        list = Arrays.asList("a", "b", "c");
        String[] array = new String[3];
        String[] array2 = list.toArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(array.equals(array2));

        System.out.println();
        list = Arrays.asList("a", "b", "c");
        array = new String[2];
        array2 = list.toArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(array.equals(array2));

        System.out.println();
        String[] array3 = {"x", "y"};
        System.out.println(Arrays.toString(array3));
        List<String> list3 = Arrays.asList(array3);
        System.out.println(list3);
        array3[0] = "z";
        System.out.println(Arrays.toString(array3));
        System.out.println(list3);
        list3.set(1, "w");
        System.out.println(Arrays.toString(array3));
        System.out.println(list3);

        System.out.println();
        List<Integer> nums = Arrays.asList(465,65,1,65,78,465,132,6,78,45,1);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

    }

}
