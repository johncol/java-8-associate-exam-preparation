package tests.hidingfields;

public class HidingFields {

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.getName());
        Child child = new Child();
        System.out.println(child.getName());
        Parent childParent = new Child();
        System.out.println(childParent.getName());
    }

}

class Parent {
    String name = "parent";
    public String getName() { return name; }
}

class Child extends Parent {
    String name = "child";
}
