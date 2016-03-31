package tests.interfaces;

public interface ExistingMethod {
    void hello();
}

class ClassA {
    void hello() { System.out.println("Hello ClassA"); }
}

class ClassB extends ClassA implements ExistingMethod  {

    public void hello() { System.out.println("Hello ClassA"); }

    public static void main(String[] args) {
        new ClassA().hello();
    }

}
