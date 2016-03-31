package tests.interfaces;

interface DefaultMethods {
    void hi();
    default void hello() {}
}

interface DefaultMethodsChild extends DefaultMethods {
    void hi();
    void hello();
}

class SomeClass implements DefaultMethods {
    public void hi() {}
}

class AnotherClass implements DefaultMethodsChild {
    public void hi() {}
    public void hello() {}
}

