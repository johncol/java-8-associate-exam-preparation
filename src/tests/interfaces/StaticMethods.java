package tests.interfaces;

interface StaticMethodsA {
    static void hi() {
        System.out.println("Hi from A");
    }
}

interface StaticMethodsB {
    static void hi() {
        System.out.println("Hi from B");
    }
}

class ClassStaticMethodsAB implements StaticMethodsA, StaticMethodsB {

    void whatever() {
        //hi(); doesn't compile
        StaticMethodsA.hi();
        StaticMethodsB.hi();
    }

    public static void main(String[] args) {
        new ClassStaticMethodsAB().whatever();
    }

}