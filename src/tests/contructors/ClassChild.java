package tests.contructors;

public class ClassChild extends ClassParent1 {

    ClassChild() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        new ClassChild();
    }
}
