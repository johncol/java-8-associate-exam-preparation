package tests;

public class Overloading implements Utils {

    void someMethod() {}

    void someMethod(byte a) { print("byte"); }
    void someMethod(short a) { print("short"); }
    void someMethod(long a) { print("long"); }

    void someMethod(String a) { print("string"); }
    void someMethod(Object a) { print("object"); }

    public void someMethod(int a, int b) {}
    private static int someMethod(String dasdasa, int dasdasdasb) { return 0; }

    protected void someMethod(int a, int b, int c) { print("several ints"); }

    void someMethod(int a) { print("int"); }
    void someMethod(int... array) { print("varargs 1"); }
    void someMethod(int b, int... array) { print("varargs 2"); }

    {
        someMethod((char) 10L);
        separator();

        someMethod(1);
        someMethod(1, null);
        someMethod(1, 2, 3);
        //someMethod(1, 2, 3, 4); // DOESN'T COMPILE
        //someMethod(null); // DOESN'T COMPILE
        separator();

        String string = null;
        someMethod(string);
        Object object = null;
        someMethod(object);
        int[] array = null;
        someMethod(array);
        separator();
    }

    public static void main(String[] args) {
        new Overloading();
    }

}
