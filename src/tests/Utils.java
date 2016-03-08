package tests;

public interface Utils {

    default void print(Object object) {
        System.out.println(object);
    }

    default void separator() {
        System.out.println();
    }

}
