package tests.hiddingstatic;

public class Child extends Parent {

    static void hi() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        hi();
    }

}
