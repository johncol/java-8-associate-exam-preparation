package tests.interfaces;

class Conflicts2 implements InterfaceAA, InterfaceBB {

    @Override
    public String get() {
        return null;
    }

}

interface InterfaceAA {
    Object get();
}

interface InterfaceBB {
    String get();
}
