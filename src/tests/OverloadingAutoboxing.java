package tests;

public class OverloadingAutoboxing implements Utils {

    void printIt(int a) { print("int"); }
    void printIt(Integer a) { print("integer"); }
    void printIt(Object a) { print("object"); }

    void printIt(ClassA a) { print("ClassA"); }
    void printIt(ClassB a) { print("ClassB"); }
    void printIt(ClassC a) { print("ClassC"); }
    void printIt(ClassD a) { print("ClassD"); }
    void printIt(InterfaceA a) { print("InterfaceA"); }
    void printIt(InterfaceB a) { print("InterfaceB"); }

    void printThem(int a, int b) { print("int int"); }
    void printThem(long a, long b) { print("long long"); }
    void printThem(Integer a, Integer b) { print("Integer Integer"); }
    void printThem(int... a) { print("int..."); }

    public static void main(String[] args) {
        new OverloadingAutoboxing();
    }

    {
        printIt(1);
        printIt(new Integer(1));
        Object integer = new Integer(1);
        printIt(integer);
        separator();

        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassA classAB = new ClassB();
        printIt(classA);
        printIt(classB);
        printIt(classAB);
        separator();

        ClassC classC = new ClassC();
        ClassD classD = new ClassD();
        InterfaceA interfaceAC = new ClassC();
        InterfaceA interfaceAD = new ClassD();
        InterfaceB interfaceBD = new ClassD();
        printIt(classC);
        printIt(classD);
        printIt(interfaceAC);
        printIt(interfaceAD);
        printIt(interfaceBD);
        separator();

        // printIt(null); doesn't compile

        printThem(1, 1);
        printThem(new Integer(1), new Integer(1));
        separator();

    }

}

interface InterfaceA {}
interface InterfaceB {}
class ClassA { }
class ClassB extends ClassA { }
class ClassC implements InterfaceA {}
class ClassD implements InterfaceA, InterfaceB {}
