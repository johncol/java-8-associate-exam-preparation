package tests.statictest.some;

import static tests.statictest.StaticMethodClass.sayHi;

public class StaticImportTest {

    public void sayHi() {
        System.out.println("hi from here");
    }

    public StaticImportTest() {
        sayHi();
    }

    public static void main(String[] args) {
        StaticImportTest test = new StaticImportTest();
    }
}
