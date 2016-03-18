package tests.inheritedmemebers;

public class Child extends Parent {

    String name = "child";

    Child() {
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
        System.out.println();
        super.hello();
        this.hello();
        hello();
    }

    void hello() {
        System.out.println("Hi! I'm the " + name);
    }

    public static void main(String[] args) {
        Child child = new Child();
    }

}
