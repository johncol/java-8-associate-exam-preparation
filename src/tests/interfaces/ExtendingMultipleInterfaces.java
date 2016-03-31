package tests.interfaces;

public interface ExtendingMultipleInterfaces extends A, B {
}

interface A { void hi(); }
interface B { void hi(); }

abstract class AbstractClassA implements ExtendingMultipleInterfaces, A, B { }

abstract class AbstractClassB implements ExtendingMultipleInterfaces, A, B {
    public abstract void hi();
}

class Class implements ExtendingMultipleInterfaces, A, B {
    public void hi() {}
}