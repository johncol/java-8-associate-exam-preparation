package tests;

public class InitializacionOrder {

    private String name = "Field value";

    {
        name = "Initializer value";
        System.out.println(name);
    }

    public InitializacionOrder() {
        name = "Constructor value";
        System.out.println(name);
    }

    public static void main(String[] args) {
        new InitializacionOrder();
    }

    {
        name = "Second initializer value";
        System.out.println(name);
    }

}
