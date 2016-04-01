package tests.casting;

class Parent {
    String message = "hi Parent";
    void printHi() {
        System.out.println(message);
    }
    void callHi() {
        this.printHi();
    }
}

class Child extends Parent {

    String message = "hi Child";
}

public class OverridingExample {

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.callHi();
    }

}
